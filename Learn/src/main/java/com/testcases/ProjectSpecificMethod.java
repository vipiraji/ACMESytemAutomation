package com.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethod  {

	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void  beforeapp(String url, String username, String password)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	    driver.findElementById("email").sendKeys(username,Keys.TAB);
	    driver.findElementById("password").sendKeys(password);
	    driver.findElementById("buttonLogin").sendKeys(Keys.ENTER);
	    	}
	@AfterMethod
	public void afterapp()
	{
		driver.close();
	}
	
}
