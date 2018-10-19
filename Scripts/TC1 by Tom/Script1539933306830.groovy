import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://desenio.se/')

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/a_Posters'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/img'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/div_Leverans  Normalt sett tar'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/div_Storleksguide'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/span_'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/div_Tavelram i koppar 21x30_ic'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/div_Tavelram i koppar 21x30_ic_1'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/div_Tillbaka'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/a_Ramar'))

WebUI.click(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/img_2'))

WebUI.setText(findTestObject('Object Repository/Page_Snygga tavlor online  Posters/input_Sk produkt_term'), 'nature')

WebUI.closeBrowser()

