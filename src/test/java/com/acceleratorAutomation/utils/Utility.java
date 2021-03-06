package com.acceleratorAutomation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Utility {
	
	@SuppressWarnings("deprecation")
	public static WebElement checkElementClick(WebDriver driver, By locator) {
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(60, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS)
			.ignoring(Throwable.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return driver.findElement(locator);
	}
	
	public static void clickElement(WebDriver driver, By locator) {
		
		checkElementClick(driver, locator).click();
		
	}
	
	public static void sendKeysElement(WebDriver driver, By locator, String data) {
		
		checkElementClick(driver, locator).sendKeys(data);
		
	}

}
