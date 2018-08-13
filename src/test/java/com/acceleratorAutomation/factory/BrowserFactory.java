package com.acceleratorAutomation.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startDesktopBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfigProperty().getValue("ChromeDriver"));
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", DataProviderFactory.getConfigProperty().getValue("GeckoDriver"));
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://evalue.internationaldelivers.com/service/service_info/Welcome.aspx");
		return driver;
	}
	
	public static void startAppiumBrowser() {
		
	}

}
