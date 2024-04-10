from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import time
chrome_option = webdriver.ChromeOptions()
chrome_option.add_experimental_option("detach",True)
service_obj = Service("C:\\Aryan\\Data analysts\\Webdriver\\chromedriver.exe")
driver = webdriver.Chrome(options=chrome_option,service=service_obj)
driver.maximize_window()
driver.implicitly_wait(6)
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/")
driver.find_element(By.CSS_SELECTOR,"input[type='search']").send_keys("ber")
all_options =driver.find_elements(By.XPATH,"//div[@class='products']/div")
print(len(all_options))
for option in all_options:
    option.find_element(By.XPATH,"div/button").click()
driver.find_element(By.XPATH,"//img[@alt='Cart']").click()
driver.find_element(By.XPATH,"//button[text()='PROCEED TO CHECKOUT']").click()
driver.find_element(By.XPATH,"//input[@class='promoCode']").send_keys("rahulshettyacademy")
driver.find_element(By.XPATH,"//button[@class='promoBtn']").click()
driver.find_element(By.XPATH,"//button[text()='Place Order']").click()