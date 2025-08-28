import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
service_obj = Service("C:\\Aryan\\Data analysts\\Webdriver\\chromedriver.exe")
chrome_options = webdriver.ChromeOptions()
chrome_options.add_experimental_option("detach",True)
driver = webdriver.Chrome(options=chrome_options,service= service_obj)
#chrome_options.add_argument("--ignore-certificates-error")
driver.maximize_window()
driver.get("https://www.instagram.com/")
print(driver.title)
print(driver.current_url)
#locator being Name
time.sleep(5)
driver.find_element(By.NAME,"username").send_keys("aryan_bansal__")
driver.find_element(By.NAME,"password").send_keys("complicated")
driver.find_element(By.CSS_SELECTOR,"div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']").click
#locator being Xpath
#driver.find_element(By.XPATH,"//input[name='username']").send_keys("aryan_bansal__")
#driver.find_element(By.XPATH,"//input[name='password']").send_keys("complicated")
driver.find_element(By.XPATH,"/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div").click()

