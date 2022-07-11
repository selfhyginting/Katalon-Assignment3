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

Mobile.waitForElementPresent(findTestObject('Object Repository/Category/android.widget.TextView - E-Commerce Android App'), 
    0)

Mobile.tap(findTestObject('Object Repository/Category/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Electronics  Gadgets'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 5 item(s)'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Fashions'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 5 item(s) (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Baby Gear'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 5 item(s) (2)'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Home  Furniture'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 5 item(s) (3)'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Health  Sports'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 5 item(s) (4)'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - Office  Industry'), 0)

Mobile.getText(findTestObject('Object Repository/Category/android.widget.TextView - 5 item(s) (5)'), 0)

Mobile.tap(findTestObject('Category/android.widget.LinearLayout'), 0)

Mobile.getText(findTestObject('Category/android.widget.TextView - Electronics  Gadgets'), 0)

Mobile.tap(findTestObject('Category/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Category/android.widget.LinearLayout (1)'), 0)

Mobile.getText(findTestObject('Category/android.widget.TextView - Fashions'), 0)

Mobile.closeApplication()

