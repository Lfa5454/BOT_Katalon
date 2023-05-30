import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://botfrontenddev.azurewebsites.net/')

WebUI.click(findTestObject('Object Repository/Login/Page_Bonus Opportunity Tracker/button_log in'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_loginfmt'), 'lfajardo@apexsystems.com')

WebUI.click(findTestObject('Object Repository/Login/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/input_Usuario_username'), 'Lfajardo')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/input_Contrasea_password'), 
    'q3zpFEbR1ZIyMj1zaNU9RA==')

WebUI.click(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/label_Recordarme'))

WebUI.click(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/input_Recordarme_okta-signin-submit'))

WebUI.click(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/a_Enviar cdigo'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/input_Introducir cdigo_answer'), 
    '354747')

WebUI.click(findTestObject('Object Repository/Login/Page_Apex Systems - Iniciar sesin/input_Introducir cdigo_button button-primary'))

WebUI.click(findTestObject('Object Repository/Login/Page_Iniciar sesin en la cuenta/input_Haga esto para reducir el nmero de ve_6bf5dd'))

WebUI.click(findTestObject('Object Repository/Login/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

