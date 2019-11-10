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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10002@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'x8UobeF0bbxd7GrPsdhkIlsTrhBxwBw1')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/input_Password does not match_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), 'vijay')

WebUI.click(findTestObject('Search user/Search user button'))

WebUI.click(findTestObject('Object Repository/Rate/Page_Search/div_Vijay Test'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/button_Rate Now'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('BDDFolder/RateUserUnverified/UnverifiedMessage'))

WebUI.verifyElementPresent(findTestObject('BDDFolder/RateUserUnverified/UnverifiedMessage'), 0)

WebUI.closeBrowser()

