package com.acceleratorAutomation.utils;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.acceleratorAutomation.reusable.GenericFunctions;

public class Helper {
	
	public static String takeScreenshot(WebDriver driver) {
		
		String destinationPath = System.getProperty("user.dir")+"/Screenshots/"+GenericFunctions.currentdateTime()+".png";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File(destinationPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return destinationPath;
	}

}
