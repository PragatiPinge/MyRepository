package com.Mandatory_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class
{
	WebDriver driver;
	
	public void BrowserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Maven_Project\\Web_Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
	}

}
