from selenium import webdriver
from selenium.webdriver.chrome.service import Service
service_obj = Service("C:\Aryan\Data analysts\Webdriver\chromedriver.exe")
driver = webdriver.Chrome(service=service_obj)
driver.maximize_window()
driver.get("https://aryanbansaltechblog.wordpress.com/")
driver.get("https://aryanbansaltechblog.wordpress.com/project-detail-with-description-and-gallery/")
print(driver.current_url)
print(driver.title)
driver.close()

