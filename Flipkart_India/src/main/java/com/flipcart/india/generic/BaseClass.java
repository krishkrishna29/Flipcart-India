package com.flipcart.india.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	 public static WebDriver driver;
	 
	 // It is use to Opening the Browser 
	 @BeforeClass
	 public void openBrowser() throws IOException {
	 	ChromeOptions options = new ChromeOptions();
	 	options.addArguments("--incognito");

	 	FileLib cls = new FileLib();
	 	String url = cls.readPropertyData("url"); // Retrieving data from properties file

	 	driver = new ChromeDriver(options);
	 	
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 	driver.get(url);
	 
	 }
	
	// It is use to Close the Browser
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser",true);
		
	}
   
}
