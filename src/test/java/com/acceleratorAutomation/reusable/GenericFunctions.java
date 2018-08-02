package com.acceleratorAutomation.reusable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericFunctions {
	
	public static String currentdateTime() {
		return new SimpleDateFormat("dd-MMM_hh-mm-SSS").format(new Date());
				
	}

}
