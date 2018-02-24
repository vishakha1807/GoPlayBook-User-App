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
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Resume_Game {
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
		
		driver.findElement(By.id("com.goplaybook:id/iv_profile")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Matches\").instance(0))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Resume\").instance(0))")).click();
	//16th over	
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file16 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file16, new File("/home/aj/Desktop/appiumScreen/1st_inning/16.png"));
		//change over
		ScoringKeys.changeOver(driver, "Scott Boland").click();
		
	//17th over
		ScoringKeys.three(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		File file17 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file17, new File("/home/aj/Desktop/appiumScreen/1st_inning/17.png"));
		//change over
		ScoringKeys.changeOver(driver, "John Hastings").click();
		
	//18th over
		ScoringKeys.legBye(driver, "1").click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.noBallFromBat(driver, "6").click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file18 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file18, new File("/home/aj/Desktop/appiumScreen/1st_inning/18.png"));
		//change over
		ScoringKeys.changeOver(driver, "Scott Boland").click();
				
	//19th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver, "Kevin Pietersen", "Mark Steketee", "Mark Steketee").click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		File file19 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file19, new File("/home/aj/Desktop/appiumScreen/1st_inning/19.png"));
		//change over
		ScoringKeys.changeOver(driver, "Marcus Stoinis").click();
			
	//20th over
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver, "Evan Gulbis", "Shadab Khan", "Ben Cutting").click();
		Thread.sleep(5000);
		ScoringKeys.runout(driver, "1", "Glenn Maxwell", "Josh Lalor", "Josh Lalor").click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		File file20 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file20, new File("/home/aj/Desktop/appiumScreen/1st_inning/20th.png"));
		
		//click on setting
		driver.findElement(By.id("com.goplaybook:id/tv_settings")).click();
	
	//go to scorecard and take screenshot
		driver.findElement(By.id("com.goplaybook:id/intervalsTV")).click();
		driver.findElement(By.xpath("//*[@text='Scorecard']")).click();
		File file21 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file21, new File("/home/aj/Desktop/appiumScreen/scorecard.png"));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Jimmy Peirson\").instance(0))"));
		File file22 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file22, new File("/home/aj/Desktop/appiumScreen/scorecard.png"));
		
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		driver.findElement(By.id("com.goplaybook:id/endDeclareInningsTV")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
	
	//Select players for second innings
		driver.findElement(By.id("com.goplaybook:id/rl_strike")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Ben Dunk\").instance(0))")).click();
		driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		driver.findElement(By.id("com.goplaybook:id/rl_nonstrike")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Luke Wright\").instance(0))")).click();
		driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		driver.findElement(By.id("com.goplaybook:id/rl_bowler")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Josh Lalor\").instance(0))")).click();
		driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		driver.findElement(By.id("com.goplaybook:id/confirmTV")).click();
		
	//2nd inning
		Inning_2.inning(driver);
		WebElement over=driver.findElement(By.id("com.goplaybook:id/tv_currentOverBall"));
		String current_overs= over.getText();
		int oversNumber = Integer.parseInt(current_overs);
		for(int i=oversNumber;i>=0;i--)
		{
		if(oversNumber!=0)
		{
			ScoringKeys.undo(driver);
			Thread.sleep(5000);
		}
		File undo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(undo, new File("/home/aj/Desktop/appiumScreen/undo.png"));
		}
		
	}
}
