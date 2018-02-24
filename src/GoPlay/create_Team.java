package GoPlay;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class create_Team {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		//caps.setCapability("udid", "674862d4"); //Give Device ID of your mobile phone
		caps.setCapability("udid", "ZY223HXGCD");
		caps.setCapability("platformName", "Android");
		//caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("appPackage", "com.goplaybook");
		caps.setCapability("appActivity", "com.goplaybook.activities.MainActivity");
		caps.setCapability("noReset", "true");
		

		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.goplaybook:id/exploreFabBtn")).click();
		driver.findElement(By.id("com.goplaybook:id/createMatchLL")).click();
		driver.findElement(By.id("com.goplaybook:id/teamNameET")).sendKeys("Team chennai");
		driver.findElement(By.id("com.goplaybook:id/addLocationRL")).click();
		driver.findElement(By.xpath("//*[@text='Delhi']")).click();
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		Thread.sleep(5000);
		String s="abcdefghijklmnopqrstuvwxyz";
		for (int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
	        String s1 = new StringBuilder().append(c).toString();
			driver.findElement(By.id("com.goplaybook:id/searchET")).sendKeys(s1);
			driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			driver.hideKeyboard();
			Thread.sleep(6000);
			int totalLinkSize = driver.findElements(By.xpath("//android.widget.LinearLayout")).size(); 
			for(int j=0;j<=4 ;j++)
			{
				String xpath = "//android.widget.LinearLayout[@index='"; 
				String actualixpath; 
				actualixpath = xpath + j+ "']";
				driver.findElement(By.xpath(actualixpath)).click();
				Thread.sleep(6000);
				
			}
			driver.findElement(By.id("com.goplaybook:id/searchET")).clear();
			Thread.sleep(6000);
			
		}
//		driver.findElement(By.id("com.goplaybook:id/searchET")).sendKeys("vi");
//		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//		driver.hideKeyboard();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.id("com.goplaybook:id/searchET")).clear();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.id("com.goplaybook:id/tv_invitefriend")).click();
//		driver.findElement(By.id("com.goplaybook:id/et_Name")).sendKeys("yashika");
//		Thread.sleep(6000);
//		driver.findElement(By.id("com.goplaybook:id/et_phoneNumber")).sendKeys("9007536568");
//		Thread.sleep(5000);
//		driver.findElement(By.id("com.goplaybook:id/tv_done")).click();
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		if(driver.findElement(By.id("android:id/message")).isDisplayed()==true){
//
//			driver.findElement(By.xpath("//*[@text='YES']")).click();
//			   }
//			   else{
//				   driver.findElement(By.id("com.goplaybook:id/tv_done")).click();
//			}
//		
//		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
//		driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//		driver.findElement(By.id("//*[@index='0']")).click();
//		System.out.println("done1");
//		driver.findElement(By.id("//*[@index='1']")).click();
//		System.out.println("done");
//		Thread.sleep(5000);
//		driver.findElement(By.id("com.goplaybook:id/ll_top[@index='2']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
//		driver.findElement(By.id("com.goplaybook:id/teamHeadingTxt")).equals(obj)

	}

}
