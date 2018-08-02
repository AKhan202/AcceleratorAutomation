package com.acceleratorAutomation.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.acceleratorAutomation.utils.Utility;

public class ActionActivities {
	
	public static void moveToElementForClick(WebDriver driver, By locator) {
		
		new Actions(driver).moveToElement(Utility.checkElementClick(driver, locator)).pause(1000).click().build().perform();
		
	}

}
