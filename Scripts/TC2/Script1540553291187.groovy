import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://desenio.se/')

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.click(findTestObject('nyaste/Page_Topplistan - Vra mest populra/div_Stng och godknn'))

WebUI.click(findTestObject('Object Repository/nyaste/Page_Snygga tavlor online  Posters/a_Posters'))

WebUI.click(findTestObject('Object Repository/nyaste/Page_Posters online. Kp prints affi/img_Vlj sortering_standardImg'))

WebUI.click(findTestObject('Object Repository/nyaste/Page_Posters online. Kp prints affi/a_Lgg i shoppingbagen'))

WebUI.click(findTestObject('Object Repository/nyaste/Page_Posters online. Kp prints affi/div_Fortstt handla'))

WebUI.click(findTestObject('Object Repository/nyaste/Page_Posters online. Kp prints affi/div_Tillbaka'))

WebUI.click(findTestObject('Object Repository/nyaste/Page_Posters online. Kp prints affi/img_Fr. 59.25 kr_standardImg l'))

WebUI.waitForElementClickable(findTestObject('nyaste/Page_Posters online. Kp prints affi/a_Lgg i shoppingbagen'), 10)

WebUI.click(findTestObject('Object Repository/nyaste/Page_Posters online. Kp prints affi/a_Lgg i shoppingbagen'))

WebUI.click(findTestObject('nyaste/Page_Posters online. Kp prints affi/div_Till kassan'))

WebUI.verifyTextPresent('758.25', false)

WebUI.closeBrowser()

