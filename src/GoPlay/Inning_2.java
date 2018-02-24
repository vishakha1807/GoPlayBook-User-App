package GoPlay;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inning_2 {
	public static WebElement inning(WebDriver driver) throws InterruptedException, IOException {
		//1st over		
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.caughtOut(driver, "Mitchell Swelson", "Kevin Pietersen", "Kevin Pietersen").click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.legBye(driver, "1").click();
			Thread.sleep(5000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			File file01 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file01, new File("/home/aj/Desktop/appiumScreen/2nd_inning/1st.png"));
		//change over
			ScoringKeys.changeOver(driver, "Mark Steketee").click();

		//2nd over
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.wide(driver, "0").click();
			Thread.sleep(5000);
			ScoringKeys.wide(driver, "0").click();
			Thread.sleep(10000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			ScoringKeys.two(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			File file02 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file02, new File("/home/aj/Desktop/appiumScreen/2nd_inning/2nd.png"));
		//change over
			ScoringKeys.changeOver(driver, "Brendon Dogget").click();
	
	//3rd over
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver, "Brendon Mccullum", "Glenn Maxwell", "Glenn Maxwell").click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.three(driver).click();
		Thread.sleep(5000);
		File file03 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file03, new File("/home/aj/Desktop/appiumScreen/2nd_inning/3.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mark Steketee").click();
	
	//4th over
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		File file04 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file04, new File("/home/aj/Desktop/appiumScreen/2nd_inning/4.png"));
		//change over
		ScoringKeys.changeOver(driver, "Shadab Khan").click();
		
	//5th over
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver, "Brendon Dogget", "Marcus Stoinis", "Marcus Stoinis").click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file05 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file05, new File("/home/aj/Desktop/appiumScreen/2nd_inning/5.png"));
		//change over
		ScoringKeys.changeOver(driver, "Brendon Dogget").click();
	
	//6th over
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(10000);
		File file06 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file06, new File("/home/aj/Desktop/appiumScreen/2nd_inning/6.png"));
		//change over
		ScoringKeys.changeOver(driver, "Shadab Khan").click();
			
	//7th over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(6000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(10000);
		ScoringKeys.bowledOut(driver, "James Faulkner").click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file07 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file07, new File("/home/aj/Desktop/appiumScreen/2nd_inning/7.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mitchell Swelson").click();
		
	//8th over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file08 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file08, new File("/home/aj/Desktop/appiumScreen/2nd_inning/8.png"));
		//change over
		ScoringKeys.changeOver(driver, "Shadab Khan").click();
						
	//9th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		File file09 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file09, new File("/home/aj/Desktop/appiumScreen/2nd_inning/9.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mitchell Swelson").click();
		
		//10th over
		ScoringKeys.legBye(driver, "1").click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file010 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file010, new File("/home/aj/Desktop/appiumScreen/2nd_inning/10.png"));
	//change over
		ScoringKeys.changeOver(driver, "Josh Lalor").click();
									
	//11st over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file011 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file011, new File("/home/aj/Desktop/appiumScreen/2nd_inning/11.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mitchell Swelson").click();
				
	//12nd over
		ScoringKeys.wide(driver, "0").click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file012 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file012, new File("/home/aj/Desktop/appiumScreen/2nd_inning/12.png"));
		//change over
		ScoringKeys.changeOver(driver, "Ben Cutting").click();
		
	//13rd over
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		File file013 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file013, new File("/home/aj/Desktop/appiumScreen/2nd_inning/13.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mitchell Swelson").click();
		
	//14th over
		ScoringKeys.noBallFromBat(driver, "0").click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file014 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file014, new File("/home/aj/Desktop/appiumScreen/2nd_inning/14.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mark Steketee").click();
					
	//15th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.wide(driver, "0").click();
		Thread.sleep(5000);
		ScoringKeys.wide(driver, "0").click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file015 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file015, new File("/home/aj/Desktop/appiumScreen/2nd_inning/15.png"));
		//change over
		ScoringKeys.changeOver(driver, "Shadab Khan").click();
					
	//16th over
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file016 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file016, new File("/home/aj/Desktop/appiumScreen/2nd_inning/16.png"));
		//change over
		ScoringKeys.changeOver(driver, "Josh Lalor").click();
		
	//17th over
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file017 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file017, new File("/home/aj/Desktop/appiumScreen/2nd_inning/17.png"));
		//change over
		ScoringKeys.changeOver(driver, "Brendon Dogget").click();
		
	//18th over
		ScoringKeys.three(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file018 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file018, new File("/home/aj/Desktop/appiumScreen/2nd_inning/18.png"));
		//change over
		ScoringKeys.changeOver(driver, "Josh Lalor").click();
				
	//19th over
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file019 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file019, new File("/home/aj/Desktop/appiumScreen/2nd_inning/19.png"));
		//change over
		ScoringKeys.changeOver(driver, "Mark Steketee").click();
			
//	//20th over
//		ScoringKeys.two(driver).click();
//		Thread.sleep(5000);
//		ScoringKeys.two(driver).click();
//		Thread.sleep(5000);
//		ScoringKeys.two(driver).click();
//		Thread.sleep(5000);
//		ScoringKeys.runout(driver, "1", "Jimmy Peirson", "Evan Gulbis", "Evan Gulbis").click();
//		Thread.sleep(5000);
//		ScoringKeys.caughtOut(driver, "Brendon Dogget", "John Hastings", "James Faulkner").click();
//		Thread.sleep(5000);
//		ScoringKeys.one(driver).click();
//		Thread.sleep(5000);
//		File file020 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file020, new File("/home/aj/Desktop/appiumScreen/2nd_inning/20th.png"));
		return null;
}
}
