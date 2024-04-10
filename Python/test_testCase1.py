def test_method1 ():
    from selenium import webdriver
    from selenium.webdriver import ActionChains
    from selenium.webdriver.chrome.service import Service
    from selenium.webdriver.common.by import By
    from selenium.webdriver.support import expected_conditions
    from selenium.webdriver.support.select import Select
    from selenium.webdriver.support.ui import WebDriverWait
    import os 
    import pandas as pd
    import datetime
    import time
    print("This is my first TestCase")

import pytest
@pytest.fixture(params=["aryan","naveen", "alka"])
def param_testing (request):
    return request.param

def test_testCase2 (param_testing):
    print(param_testing)