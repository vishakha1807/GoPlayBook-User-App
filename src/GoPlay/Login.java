package GoPlay;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	 {
				//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "My Phone");
				caps.setCapability("udid", "ZY223HXGCD"); //Give Device ID of your mobile phone
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "6.0.1");
				caps.setCapability("appPackage", "com.goplaybook");
				caps.setCapability("appActivity", "com.goplaybook.activities.MainActivity");
				caps.setCapability("noReset", "true");
				
			
						AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
						driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
						driver.findElement(By.id("com.goplaybook:id/mobileNoET")).sendKeys("7500355112");
						Thread.sleep(5000);
						driver.findElement(By.id("com.goplaybook:id/nextLL")).click();
						driver.findElement(By.id("com.goplaybook:id/txt_pin_entry")).click();
						Thread.sleep(10000);
						driver.findElement(By.id("com.goplaybook:id/nextLL")).click();
						if(driver.findElement(By.id("com.goplaybook:id/detectLocationLL")).isDisplayed())
						{
						driver.findElement(By.id("com.goplaybook:id/detectLocationLL")).click();
						driver.findElement(By.id("com.goplaybook:id/locationET")).sendKeys("innotical");
						driver.findElement(By.xpath("//*[@text='Innotical, Lohia Road, H Block, Noida, Uttar Pradesh, India']")).click();
						Thread.sleep(3000);

						}
						
	 }
}
