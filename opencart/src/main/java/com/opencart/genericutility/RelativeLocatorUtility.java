package com.opencart.genericutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorUtility {
	WebDriver driver;
	public RelativeLocatorUtility(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void configAbove(WebElement ref,String tagName) {
		driver.findElement(RelativeLocator.with(By.tagName(tagName)).above(ref));
	}

}
