package com.empmonitor.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.empmonitor.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClasss {

	
	ReadConfig read = new ReadConfig();
	String url = read.getBaseUrl();
	String browser = read.getBrowser();
	
	
	public static WebDriver driver;
	
	//opening the browser 
	@BeforeClass
	public void setup()
	{
		switch(browser.toLowerCase())
		{
		case"chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	
	//Closing the browser
	@AfterClass
	public void Teardown()
	{
		driver.close();
		driver.quit();
		
	}
	
	// failed test cases screenshot 
	
	public void screenshot (WebDriver driver , String testname) throws IOException
	{
		TakesScreenshot  screenshot =(TakesScreenshot)driver; 
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File desc = new File ("user.dir"+"Screenshot"+testname+".png");
		FileUtils.copyDirectory(src, desc);
	}
	
	
}
