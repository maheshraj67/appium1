package appium;
 
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

 
public class Kbiton {
 
 private static AndroidDriver driver;
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
 File classpathRoot = new File(System.getProperty("user.dir"));
 File appDir = new File(classpathRoot, "/Apps/Amazon/");
 File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");
 
 String kobitonServerUrl = "https://maheshraj.67:401a651d-8cdf-438a-bfc6-33b9c45c4916@api.kobiton.com/wd/hub";

 DesiredCapabilities capabilities = new DesiredCapabilities(); 
 // The generated session will be visible to you only. 
 capabilities.setCapability("sessionName", "Automation test session");
 capabilities.setCapability("sessionDescription", ""); 
 capabilities.setCapability("deviceOrientation", "portrait");  
 capabilities.setCapability("captureScreenshots", true); 
 capabilities.setCapability("browserName", "chrome"); 
 capabilities.setCapability("deviceGroup", "KOBITON"); 
 // For deviceName, platformVersion Kobiton supports wildcard
 // character *, with 3 formats: *text, text* and *text*
 // If there is no *, Kobiton will match the exact text provided
 capabilities.setCapability("deviceName", "Galaxy J7 Prime");
 capabilities.setCapability("platformVersion", "6.0.1");
 capabilities.setCapability("platformName", "Android"); 

 
 /*DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 capabilities.setCapability("deviceName", "Micromax A311");
 capabilities.setCapability("platformVersion", "4.4.2");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("app", app.getAbsolutePath());
 capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
 capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");*/
 
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
 Thread.sleep(10000);
 driver.quit();
 
 }
 
}