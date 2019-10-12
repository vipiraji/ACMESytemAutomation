package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ACMESystem extends ProjectSpecificMethod{

    @Test
	public  void searchvendor() {
		
    	Actions builder=new Actions(driver);
	    builder.moveToElement(driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]")).perform();
	    driver.findElementByLinkText("Search for Vendor").click();
	    driver.findElementById("vendorName").sendKeys("blue lagoon");
        driver.findElementById("buttonSearch").click();
        WebElement table = driver.findElementByClassName("table");
		//List<WebElement> allrows = table.findElements(By.tagName("tr"));
		List<WebElement> allcols = table.findElements(By.tagName("td"));
		System.out.println(allcols.get(4).getText());

	}
}
