package appium;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;


public class TestNG {
WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	 File classpathRoot = new File(System.getProperty("user.dir"));
	 File appDir = new File(classpathRoot, "/Apps/Pazo/");
	 File app = new File(appDir, "app-ppz-debug.apk");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	 capabilities.setCapability("deviceName", "Samsung");
	 capabilities.setCapability("platformVersion", "5.1.1");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("app", app.getAbsolutePath());
	 capabilities.setCapability("appPackage", "com.pazo.ppz");
	 capabilities.setCapability("appPackage1", "com.google.android.packageinstaller");
	 capabilities.setCapability("appActivity", "com.tagtual.trackd.Activities.Splash");
	 capabilities.setCapability("appActivity1", "com.tagtual.trackd.Activities.LicenceLogin");
	 
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	// Thread.sleep(10000);
	
}

@Test
public void testCal() throws Exception {
   //locate the Text on the calculator by using By.name()
   //WebElement two=driver.findElement(By.id("2"));
	driver.findElement(By.xpath("//android.widget.TextView[@index='5']")).click();
	//driver.findElement(By.xpath("//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etemail')]").sendKeys("checklist.related@gmail.com");
	//driver.hideKeyboard();
	
	driver.findElement(By.xpath("//android.widget.TextView[@index='5']")).sendKeys("checklist.related@gmail.com");
   //driver.hideKeyboard();
	 //driver.findElements(By.xpath(xpathExpression)"//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etpin')]").sendKeys("12345");
	//MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]");
	//el1.click();
   //plus.click();
   //plus.sendKeys("1234");
   WebElement four=driver.findElement(By.id("com.pazoinc.app:id/btnSubmit"));
   four.click();
  //WebElement equalTo=driver.findElement(By.name("="));
  // equalTo.click();
   //locate the edit box of the calculator by using By.tagName()
   //WebElement results=driver.findElement(By.tagName("EditText"));
	//Check the calculated value on the edit box
//assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";
   
}

@AfterClass
public void teardown(){
	//close the app
	driver.quit();
}
}