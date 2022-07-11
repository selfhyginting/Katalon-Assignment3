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

Mobile.tap(findTestObject('Object Repository/Detail Profile/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - Profile'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - Your Name'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - your.emailgmail.com'), 0)

Mobile.tap(findTestObject('Object Repository/Detail Profile/android.widget.TextView - EDIT'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - User Profile'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - Your Name (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - your.emailgmail.com (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - 628123456789'), 0)

Mobile.getText(findTestObject('Object Repository/Detail Profile/android.widget.TextView - Your Address'), 0)

Mobile.closeApplication()

