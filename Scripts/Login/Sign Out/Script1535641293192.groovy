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

WebUI.navigateToUrl('https://dev.getchoosi.com/app/#/login?goLogin=true')

WebUI.setText(findTestObject('Page_Choosi_Login/input_identification'), 'Julieta')

WebUI.setEncryptedText(findTestObject('Page_Choosi_Login/input_password'), 'j1INIxr+GRyqvipkC1+6ow==')

WebUI.click(findTestObject('Page_Choosi_Login/button_Sign In'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Choosi_Login/a_Sign Out'))

new_btn = WebUI.modifyObjectProperty(findTestObject('Page_Choosi_Login/li_Sign In'), 'id', 'equals', '//[@id="ember427"]/div/div/div[2]/div[1]/form/div[4]/button[1]', 
    false)

WebUI.delay(3)

WebUI.click(new_btn)

WebUI.verifyElementPresent(findTestObject('Page_Choosi_Login/button_Sign In'), 0)

WebUI.closeBrowser()

