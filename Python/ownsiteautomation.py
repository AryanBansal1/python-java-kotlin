from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
chrome_option = webdriver.ChromeOptions()
chrome_option.add_experimental_option("detach", True)
service_obj = Service("C:\\Aryan\\Data analysts\\Webdriver\\chromedriver.exe")
driver = webdriver.Chrome(service= service_obj , options= chrome_option)
driver.get("https://rahulshettyacademy.com/AutomationPractice/")
driver.find_element(By.XPATH,"//input[@value = 'radio1']").click()
driver.find_element(By.CSS_SELECTOR,"input[id='autocomplete']").send_keys("Graduate")
driver.find_element(By.CSS_SELECTOR,"input[id='checkBoxOption2']").click()
driver.find_element(By.CSS_SELECTOR,"select[id='dropdown-class-example']").click()