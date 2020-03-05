package com.baseclass;

import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEX {

	protected WebDriver driver;
	// Launching browser
	public void launchApplication(String browser, String url) {
		
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				//Login_toAppSystem.setProperty("webdriver.gecko.driver","C:\\Users\\BLTuser.BLT1209\\Downloads\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize(); //maximize the windows
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Waiting for 30 seconds
			driver.get(url);
		
		} catch (WebDriverException e) {
			System.out.println(" browser could not be launched");
		}
	
	}
	public void Screenshot(String sc) throws IOException
	{
		// Taking screenshot
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File(sc));
		//C:\Users\BLTuser.BLT1209\eclipse-workspace\selenium\screenshot
	}
   public void quit() // close the browser
   {
	   driver.close();
   }
}
