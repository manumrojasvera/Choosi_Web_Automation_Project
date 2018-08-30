import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.getchoosi.com/app/#/public-menus/grabngo')

WebUI.click(findTestObject('Object Repository/Menu GandG/a_Switch Menus'))

/*WebUI.click(findTestObject('Object Repository/Menu GandG/div_Demo High School 1'))*/
new_btn = WebUI.modifyObjectProperty(findTestObject('Menu GandG/div_Demo High School 1'), 'id', 'equals', '//*[@id="ember-power-select-trigger-ember"]', 
    false)

WebUI.delay(3)

WebUI.click(new_btn)

WebUI.click(findTestObject('Menu GandG/Switch District and School/span_Demo High School 3'))

WebUI.click(findTestObject('Object Repository/Menu GandG/button_Switch'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Menu GandG/Switch District and School/p_There are no Menu items for'), 5000)

WebUI.closeBrowser()

