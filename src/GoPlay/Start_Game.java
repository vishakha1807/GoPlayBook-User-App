package GoPlay;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Start_Game {
	
	public static void main(String[] args) throws InterruptedException, IOException {

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
		
		String[] strArray = new String[]{"Glenn Maxwell","Michael Beer","Mitchell Swelson","Yasir Shah"};
		driver.findElement(By.id("com.goplaybook:id/exploreFabBtn")).click();
		driver.findElement(By.id("com.goplaybook:id/startGameRL")).click();
		driver.findElement(By.id("com.goplaybook:id/rl_pickTeamA")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.goplaybook:id/et_search")).sendKeys("melbourne");
		Thread.sleep(6000);
		driver.findElement(By.id("com.goplaybook:id/tv_name")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.goplaybook:id/rl_pickTeamB")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.goplaybook:id/et_search")).sendKeys("bris");
		Thread.sleep(5000);
		driver.findElement(By.id("com.goplaybook:id/tv_name")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		driver.findElement(By.xpath("//*[@text='Liam Bowe']")).click();
		driver.findElement(By.xpath("//*[@text='Cameron Gannon']")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_keeper")).click();
		driver.findElement(By.xpath("//*[@text='Rob Quiney']")).click();
		driver.findElement(By.xpath("//*[@text='Chris Lynn']")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_lineup")).click();
		driver.findElement(By.xpath("//*[@text='Michael Beer']")).click();
		driver.findElement(By.xpath("//*[@text='Mitchell Swelson']")).click();
		driver.findElement(By.xpath("//*[@text='Yasir Shah']")).click();
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.goplaybook:id/et_numberOfOvers")).sendKeys("5");
		Thread.sleep(3000);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/home/aj/Desktop/appiumScreen/overs.png"));
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            }
		Thread.sleep(5000);
		driver.findElement(By.id("com.goplaybook:id/tv_location")).click();
		driver.findElement(By.xpath("//*[@text='Search Grounds Here']")).sendKeys("Demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Demo']")).click();
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_teamA")).click();
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.id("com.goplaybook:id/tv_totalOver"));
		String overs= element.getText();
		int oversNumber = Integer.parseInt(overs);
		for(int i=0;i<=oversNumber;i++)
		{
			
				ScoringKeys.wide(driver,"0").click();	
				Thread.sleep(5000);
				ScoringKeys.caughtOut(driver,"Cameron Gannon","Michael Beer","0").click();
				Thread.sleep(10000);
				ScoringKeys.noBallBye(driver,"1").click();
				Thread.sleep(5000);
				ScoringKeys.legBye(driver,"1").click();
				Thread.sleep(5000);
				ScoringKeys.one(driver).click();
				Thread.sleep(5000);
				ScoringKeys.zero(driver).click();
				Thread.sleep(5000);
				ScoringKeys.six(driver).click();
				Thread.sleep(5000);
				if(i!=oversNumber-1)
				{
				driver.findElement(By.id("com.goplaybook:id/tv_nextOver")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		}
			
				else
				{
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.id("com.goplaybook:id/rl_strike")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/rl_nonstrike")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/rl_bowler")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/confirmTV")).click();
				
			}
		}
	}
}
