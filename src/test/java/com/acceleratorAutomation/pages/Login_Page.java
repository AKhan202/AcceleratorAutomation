/**
 * 
 */
package com.acceleratorAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.acceleratorAutomation.utils.Utility;

/**
 * @author u01n233
 *
 */
public class Login_Page {
	WebDriver driver;
	
	By Username = By.xpath("//*[@name='username']");
	By Password = By.xpath("//*[@name='password']");
	By Login = By.xpath("//*[@type='submit']");
	
	public Login_Page(WebDriver ldriver) {
		this.driver = ldriver;	
	}
	
	public void loginAction(String user, String pswd) {
		Utility.sendKeysElement(driver, Username, user);
		Utility.sendKeysElement(driver, Password, pswd);
		Utility.clickElement(driver, Login);
	}
	
	
	
	
}

