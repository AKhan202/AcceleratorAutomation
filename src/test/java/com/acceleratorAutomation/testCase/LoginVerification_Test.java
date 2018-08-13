package com.acceleratorAutomation.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acceleratorAutomation.factory.BrowserFactory;
import com.acceleratorAutomation.pages.Home_Page;
import com.acceleratorAutomation.pages.Login_Page;

public class LoginVerification_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void testSetup() {
		driver = BrowserFactory.startDesktopBrowser("Firefox");
	}
	
	@Test
	public void loginVerification() {
		Login_Page oLogin_Page = new Login_Page(driver);
		oLogin_Page.loginAction("", "");
		
		Home_Page oHome_Page = new Home_Page(driver);
		oHome_Page.homePageTitle();
	}
	
	@AfterMethod
	public void testClosure() {
		driver.quit();
	}

}
