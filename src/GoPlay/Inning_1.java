package GoPlay;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inning_1 {
	
	public static WebElement inning(WebDriver driver) throws InterruptedException, IOException {
		//1st over		
			ScoringKeys.noBallFromBat(driver,"1").click();
			Thread.sleep(5000);
			ScoringKeys.four(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File("/home/aj/Desktop/appiumScreen/1st_inning/1st.png"));
		//change over
			ScoringKeys.changeOver(driver, "Michael Beer").click();

		//2nd over
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			ScoringKeys.caughtOut(driver,"John Hastings","Sam Heazlett","Sam Heazlett").click();
			Thread.sleep(10000);
			ScoringKeys.zero(driver).click();
			Thread.sleep(5000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			ScoringKeys.one(driver).click();
			Thread.sleep(5000);
			File file2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2, new File("/home/aj/Desktop/appiumScreen/1st_inning/2nd.png"));
		//change over
			ScoringKeys.changeOver(driver, "Scott Boland").click();
	
	//3rd over
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.wide(driver,"0").click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("/home/aj/Desktop/appiumScreen/1st_inning/3.png"));
		//change over
		ScoringKeys.changeOver(driver, "Michael Beer").click();
	
	//4th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file4, new File("/home/aj/Desktop/appiumScreen/1st_inning/4.png"));
		//change over
		ScoringKeys.changeOver(driver, "John Hastings").click();
		
	//5th over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file5, new File("/home/aj/Desktop/appiumScreen/1st_inning/5.png"));
		//change over
		ScoringKeys.changeOver(driver, "Michael Beer").click();
	
	//6th over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver,"John Hastings","Joe Burns","Brendon Mccullum").click();
		Thread.sleep(10000);
		File file6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file6, new File("/home/aj/Desktop/appiumScreen/1st_inning/6.png"));
		//change over
		ScoringKeys.changeOver(driver, "Marcus Stoinis").click();
			
	//7th over
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.noBallFromBat(driver, "0").click();
		Thread.sleep(6000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver, "Glenn Maxwell", "Alexx Ross","Joe Burns").click();
		Thread.sleep(10000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file7, new File("/home/aj/Desktop/appiumScreen/1st_inning/7.png"));
		//change over
		ScoringKeys.changeOver(driver, "Adam Zampa").click();
		
	//8th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file8, new File("/home/aj/Desktop/appiumScreen/1st_inning/8.png"));
		//change over
		ScoringKeys.changeOver(driver, "Marcus Stoinis").click();
						
	//9th over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		File file9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file9, new File("/home/aj/Desktop/appiumScreen/1st_inning/9.png"));
		//change over
		ScoringKeys.changeOver(driver, "Adam Zampa").click();
		
		//10th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.noBallFromBat(driver, "2").click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file10, new File("/home/aj/Desktop/appiumScreen/1st_inning/10.png"));
	//change over
		ScoringKeys.changeOver(driver, "John Hastings").click();
									
	//11st over
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.wide(driver,"0").click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.four(driver).click();
		Thread.sleep(5000);
		File file11 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file11, new File("/home/aj/Desktop/appiumScreen/1st_inning/11.png"));
		//change over
		ScoringKeys.changeOver(driver, "Adam Zampa").click();
				
	//12nd over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file12 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file12, new File("/home/aj/Desktop/appiumScreen/1st_inning/12.png"));
		//change over
		ScoringKeys.changeOver(driver, "Evan Gulbis").click();
		
	//13rd over
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file13 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file13, new File("/home/aj/Desktop/appiumScreen/1st_inning/13.png"));
		//change over
		ScoringKeys.changeOver(driver, "Glenn Maxwell").click();
		
	//14th over
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
		File file14 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file14, new File("/home/aj/Desktop/appiumScreen/1st_inning/14.png"));
		//change over
		ScoringKeys.changeOver(driver, "Marcus Stoinis").click();
					
	//15th over
		ScoringKeys.six(driver).click();
		Thread.sleep(5000);
		ScoringKeys.caughtOut(driver, "Ben Dunk", "Ben Cutting", "Alexx Ross").click();
		Thread.sleep(5000);
		ScoringKeys.zero(driver).click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		ScoringKeys.legBye(driver, "2").click();
		Thread.sleep(5000);
		ScoringKeys.two(driver).click();
		Thread.sleep(5000);
		File file15 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file15, new File("/home/aj/Desktop/appiumScreen/1st_inning/15.png"));
		//change over
		ScoringKeys.changeOver(driver, "Michael Beer").click();
					
	//16th over
		ScoringKeys.one(driver).click();
		Thread.sleep(5000);
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
		return null;
}
}
