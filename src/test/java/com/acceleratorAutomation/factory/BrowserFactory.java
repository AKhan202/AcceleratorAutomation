package com.acceleratorAutomation.factory;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;




public class BrowserFactory {
	static DesiredCapabilities capabilities;
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
		
		File classpathRoot = new File(System.getProperty("user.dir"));  // Does this File app, File appDir and class path go 
		File appDir = new File(classpathRoot, "/Apps/AcceleratorApp/");  // under Config Data provede?
		File app = new File(appDir, "Accelerator_3.0Test_TimestampFix.apk");

		capabilities = new DesiredCapabilities();

		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Galaxy Tab E");
		capabilities.setCapability("autoWebview", "true");
		capabilities.setCapability("CapabilityType.BROWSER_NAME", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appium-version", "1.6.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.navistar.writeup");
		capabilities.setCapability("appActivity", "com.navistar.writeup.AcceleratorActivity");
		capabilities.setCapability("autoWebview", "false");
		capabilities.setCapability("newCommandTimeout", 60 * 5);
		
	//	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

}
