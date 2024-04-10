dict = {}
id = int(input("Please enter your ID: "))
name = input("Please enter your name: ")
age = int(input("What is your age?: "))
address = input("Where do you live?: ")
dict= {"UserName": name,"UserAge":age,"UserAddress":address}
uid = int(input("The id you want to retrive: "))
if uid == id:
    print(dict)
else :
    print("No user found")