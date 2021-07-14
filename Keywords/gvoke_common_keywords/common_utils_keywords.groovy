package gvoke_common_keywords


import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil


import internal.GlobalVariable



public class common_utils_keywords {

	WebDriver webDriver = DriverFactory.getWebDriver()
	WebElement webElement
	JavascriptExecutor js = (JavascriptExecutor) webDriver
	@Keyword
	def static errorvalidation(TestObject to,String se) {


		WebElement element=WebUiCommonHelper.findWebElement(to,20);

		if(element.getText().equals(se)) {
			System.out.println("Validation msg is available");
		}
		else {
			KeywordUtil.markFailed("Validation msg is not expected and please check on the error msg")
		}
	}


	@Keyword
	def static alert_submit(TestObject to ) {


		WebUI.focus(to)

		WebUI.click(to)
	}
}