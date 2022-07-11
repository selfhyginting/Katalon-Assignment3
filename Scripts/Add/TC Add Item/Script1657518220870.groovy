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

Mobile.waitForElementPresent(findTestObject('Object Repository/Add Item/android.widget.TextView - E-Commerce Android App'), 
    0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Add Item/android.widget.TextView - 899 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Add Item/android.widget.TextView - 5 item(s)'), 0)

Mobile.tap(findTestObject('Add Item/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/Add Item/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.Button - Add'), 0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.TextView'), 0)

Mobile.getText(findTestObject('Add Item/android.widget.TextView - Samsung Galaxy S10 - Black'), 0)

Mobile.getText(findTestObject('Object Repository/Add Item/android.widget.TextView - 899 USD x 1'), 0)

Mobile.getText(findTestObject('Object Repository/Add Item/android.widget.TextView - 899 USD (1)'), 0)

Mobile.getText(findTestObject('Add Item/android.widget.TextView - Total  989 USD'), 0)

Mobile.getText(findTestObject('Object Repository/Add Item/android.widget.TextView - Tax  10'), 0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.Button - Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Add Item/android.widget.EditText - Your Name'), 'selfhy ginting', 0)

Mobile.setText(findTestObject('Object Repository/Add Item/android.widget.EditText - your.emailgmail.com'), 'selfhy@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Add Item/android.widget.EditText - 628123456789'), '081231231233', 0)

Mobile.setText(findTestObject('Object Repository/Add Item/android.widget.EditText - Your Address'), 'jalan setiabudi', 0)

Mobile.getText(findTestObject('Object Repository/Add Item/android.widget.TextView - TNT Express'), 0)

Mobile.getText(findTestObject('Object Repository/Add Item/android.widget.EditText - 1 Samsung Galaxy S10 - Black 899 USD,Order  899 USDTax  10   90 USDTotal  989 USD'), 
    0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.Button - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/Add Item/android.widget.TextView - Submit your order'), 0)

Mobile.closeApplication()

