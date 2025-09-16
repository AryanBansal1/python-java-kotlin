
from langchain_community.document_loaders import PyPDFLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
import pandas as pd
import os
from langchain_community.vectorstores import Chroma
from langchain_google_genai import ChatGoogleGenerativeAI, GoogleGenerativeAIEmbeddings
from langchain.chains import RetrievalQA
from fastapi import FastAPI, UploadFile, File
from fastapi.middleware.cors import CORSMiddleware
import tempfile

# Initialize fastapi
app = FastAPI()

# Allow access 
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_headers=["*"],
    allow_methods=["*"]
)

@app.post("/analyze")
async def analyze_report(file: UploadFile=File(...)):

    # Save uploaded file temporary
    temp = tempfile.NamedTemporaryFile(delete=False,suffix=".pdf")
    with open(temp.name,"wb")as f:
        f.write(await file.read())
    
    report_loader = PyPDFLoader(temp.name)
    report = report_loader.load()
    report_text ="".join([docs.page_content for docs in report])



    # extracting from pdf and splitting it 
    loader = PyPDFLoader("lab_values.pdf")
    doc = loader.load()
    splitter = RecursiveCharacterTextSplitter(chunk_size=500,chunk_overlap=20)
    document = splitter.split_documents(documents=doc)

    # storing in vector db
    key = os.getenv("Gemini_key")
    embedding = GoogleGenerativeAIEmbeddings(model="models/embedding-001", google_api_key=key)
    db = Chroma.from_documents(
        embedding=embedding,
        documents=document,
        persist_directory="mydb",
        collection_name="my_collection"
    )
    retriever = db.as_retriever(search_kwargs={'k':1})

    # Making pipline
    llm = ChatGoogleGenerativeAI(model="gemini-2.0-flash", api_key=key)
    qa = RetrievalQA.from_chain_type(
        retriever = retriever,
        llm = llm,
        chain_type="stuff"
    )

    query = f"""
        The following is a patient's lab report:

        {report_text}

        Please explain the abnormal results and suggest the next steps according to clinical guidelines.
        """
    result = qa.invoke(query)
    return {"filename": file.filename, "analysis": result}
    