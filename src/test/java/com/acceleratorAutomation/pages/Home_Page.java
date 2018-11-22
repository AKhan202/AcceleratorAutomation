/**
 * 
 */
package com.acceleratorAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.acceleratorAutomation.utils.Utility;

/**
 * @author u01n233
 *
 */
public class Home_Page {
	WebDriver driver;
	
	By Username = By.xpath("//*[@name='u01n233']");
	By Password = By.xpath("//*[@name='password']");
	By Login = By.xpath("//*[@type='submit']");
	
	public Home_Page(WebDriver ldriver) { // What is ldriver here??//
		this.driver = ldriver;	
	}
	
	public void homePageTitle() {
		Assert.assertEquals(driver.getTitle(), "https://evaluet.internationaldelivers.com/service/service_info/Welcome.aspx");
	}
	
	
	
	
}

