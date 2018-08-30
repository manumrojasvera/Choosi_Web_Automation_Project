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

WebUI.setText(findTestObject('Page_Choosi_Login/input_identification'), 'mariela')

WebUI.setEncryptedText(findTestObject('Page_Choosi_Login/input_password'), 'S9hyYltUiT/EkAv8LZhAgg==')

WebUI.click(findTestObject('Page_Choosi_Login/button_Sign In'))

WebUI.delay(2)

WebUI.click(findTestObject('User Info page/Persona lInfo Tab/i_fa fa-cog icon-color icon-si'))

WebUI.verifyElementPresent(findTestObject('User Info page/Persona lInfo Tab/label_Email Address'), 0)

WebUI.verifyElementPresent(findTestObject('User Info page/Persona lInfo Tab/label_First Name'), 0)

WebUI.verifyElementPresent(findTestObject('User Info page/Persona lInfo Tab/label_Last Name'), 0)

WebUI.verifyElementPresent(findTestObject('User Info page/Persona lInfo Tab/label_Nickname'), 0)

WebUI.verifyElementPresent(findTestObject('User Info page/Persona lInfo Tab/label_Preferred Language'), 0)

WebUI.verifyElementPresent(findTestObject('User Info page/Persona lInfo Tab/label_Username'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

