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

WebUI.click(findTestObject('Menu GandG/Switch District and School/a_Switch Menus'))

new_btn = WebUI.modifyObjectProperty(findTestObject(('Object Repository/Menu GandG/Switch District and School/div_Demo District 101 S.C.')), 'id', 'equals', '//*[@id="ember-power-select-trigger-ember"]', 
    false)
WebUI.click(new_btn)

WebUI.setText(findTestObject('Menu GandG/Switch District and School/input'), 'demo')

WebUI.click(findTestObject('Menu GandG/Switch District and School/li_Demopolis City Ala.'))

new_btn_2 = WebUI.modifyObjectProperty(findTestObject(('Object Repository/Menu GandG/Switch District and School/div_Please select a school.')), 'id', 'equals', '//*[@id="ember-power-select-trigger-ember"]', 
    false)
WebUI.click(new_btn_2)

WebUI.click(findTestObject('Menu GandG/Switch District and School/li_Us Jones Elementary School'))

WebUI.click(findTestObject('Menu GandG/Switch District and School/button_Switch'))
WebUI.delay(3)

WebUI.verifyElementPresent((findTestObject('Object Repository/Menu GandG/Switch District and School/div_Us Jones Elementary School')), 5000)

WebUI.closeBrowser()

