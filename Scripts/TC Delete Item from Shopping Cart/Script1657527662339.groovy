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

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.EditText'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.Button - Add'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.Button - Yes'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.TextView - Whoops, your cart is empty'), 
    0)

Mobile.tap(findTestObject('Object Repository/Delete Item from Shopping Cart/android.widget.Button - Continue Shopping'), 0)

Mobile.closeApplication()

