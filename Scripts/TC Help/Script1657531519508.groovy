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

Mobile.startApplication('C:\\Users\\095048\\Katalon Studio\\Assignment3_Mobile_Test\\APK\\ECommerceSAMPLEAndroidapk211206125027-220627-220655\\ECommerce -SAMPLE-Android.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Help/android.view.ViewGroup'), 0)

Mobile.getText(findTestObject('Object Repository/Help/android.widget.TextView - Help'), 0)

Mobile.tap(findTestObject('Object Repository/Help/android.widget.TextView - How to order'), 0)

Mobile.getText(findTestObject('Object Repository/Help/android.view.View - How To Shop At Solomerce Apps'), 0)

Mobile.tap(findTestObject('Object Repository/Help/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Help/android.widget.TextView - Payment'), 0)

Mobile.getText(findTestObject('Object Repository/Help/android.view.View - Solomerce will send information on the number of total expenditures and postage to your email address, for details please check your email'), 
    0)

Mobile.tap(findTestObject('Help/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Help/android.widget.TextView - Shipping'), 0)

Mobile.getText(findTestObject('Object Repository/Help/android.view.View - For shipping, we use a number of shipping services (couriers) JNE, TIKI, and Pos Indonesia'), 
    0)

Mobile.tap(findTestObject('Help/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Help/android.widget.TextView - Profile'), 0)

Mobile.getText(findTestObject('Object Repository/Help/android.widget.TextView - Profile (1)'), 0)

Mobile.tap(findTestObject('Help/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Help/android.widget.TextView - Contact us'), 0)

Mobile.getText(findTestObject('Help/android.widget.TextView - Contact us (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help/android.webkit.WebView'), 0)

Mobile.tap(findTestObject('Help/android.widget.ImageButton'), 0)

Mobile.closeApplication()

