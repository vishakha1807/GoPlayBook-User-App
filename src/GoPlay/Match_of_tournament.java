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

public class Match_of_tournament {
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
		
		driver.findElement(By.id("com.goplaybook:id/exploreFabBtn")).click();
		driver.findElement(By.id("com.goplaybook:id/startGameRL")).click();
		driver.findElement(By.id("com.goplaybook:id/tounamentMatchTV")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='MATCH ID']")).sendKeys("237869");
		Thread.sleep(5000);
		try {
			((AppiumDriver) driver).hideKeyboard();
			}catch (Exception e) {
            }
		driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
		Thread.sleep(5000);
		
		//Team A players selection
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']"));
		ScoringKeys.Captain(driver, "Liam Bowe").click();
		ScoringKeys.wicketKeeper(driver, "Rob Quiney").click();
		ScoringKeys.selectPlayersTeamA(driver, "Glenn Maxwell").click();
		ScoringKeys.selectPlayersTeamA(driver, "Michael Beer").click();
		ScoringKeys.selectPlayersTeamA(driver, "Scott Boland").click();
		ScoringKeys.selectPlayersTeamA(driver, "Adam Zampa").click();
		ScoringKeys.selectPlayersTeamA(driver, "Evan Gulbis").click();
		ScoringKeys.selectPlayersTeamA(driver, "John Hastings").click();
		ScoringKeys.selectPlayersTeamA(driver, "James Faulkner").click();
		ScoringKeys.selectPlayersTeamA(driver, "Marcus Stoinis").click();
		ScoringKeys.selectPlayersTeamA(driver, "Kevin Pietersen").click();
		ScoringKeys.selectPlayersTeamA(driver, "Ben Dunk").click();
		ScoringKeys.selectPlayersTeamA(driver, "Luke Wright").click();
		
		//Team B players selection
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']"));
		ScoringKeys.Captain(driver, "Cameron Gannon").click();
		ScoringKeys.wicketKeeper(driver, "Chris Lynn").click();
		ScoringKeys.selectPlayersTeamB(driver, "Mitchell Swelson").click();
		ScoringKeys.selectPlayersTeamB(driver, "Sam Heazlett").click();
		ScoringKeys.selectPlayersTeamB(driver, "Brendon Dogget").click();
		ScoringKeys.selectPlayersTeamB(driver, "Josh Lalor").click();
		ScoringKeys.selectPlayersTeamB(driver, "Mark Steketee").click();
		ScoringKeys.selectPlayersTeamB(driver, "Shadab Khan").click();
		ScoringKeys.selectPlayersTeamB(driver, "Ben Cutting").click();
		ScoringKeys.selectPlayersTeamB(driver, "Alexx Ross").click();
		ScoringKeys.selectPlayersTeamB(driver, "Joe Burns").click();
		ScoringKeys.selectPlayersTeamB(driver, "Jimmy Peirson").click();
		ScoringKeys.selectPlayersTeamB(driver, "Brendon Mccullum").click();
		
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.goplaybook:id/et_numberOfOvers")).sendKeys("20");
		Thread.sleep(3000);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/home/aj/Desktop/appiumScreen/overs.png"));
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            }
		driver.findElement(By.id("com.goplaybook:id/tv_location")).click();
		driver.findElement(By.xpath("//*[@text='Search Grounds Here']")).sendKeys("Chopraas Place");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chopraas Place']")).click();
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		//Batting team selection
		driver.findElement(By.id("com.goplaybook:id/tv_teamB")).click();
		//strike player
		driver.findElement(By.id("com.goplaybook:id/rl_strike")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Jimmy Peirson\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='Jimmy Peirson']")).click();
		driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		//Non strike player
		driver.findElement(By.id("com.goplaybook:id/rl_nonstrike")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Brendon Mccullum\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='Brendon Mccullum']")).click();
		driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		//Bowler
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bowler\").instance(0))"));
		driver.findElement(By.id("com.goplaybook:id/rl_bowler")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"James Faulkner\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='James Faulkner']")).click();
		driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
		driver.findElement(By.id("com.goplaybook:id/rightLL")).click();
		Thread.sleep(3000);
			//1st inning
				Inning_1.inning(driver);
		
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
