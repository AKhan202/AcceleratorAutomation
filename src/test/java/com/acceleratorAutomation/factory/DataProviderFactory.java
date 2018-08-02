package com.acceleratorAutomation.factory;

import com.acceleratorAutomation.externalFileHandler.ConfigDataProvider;

public class DataProviderFactory {
	
	public static ConfigDataProvider getConfigProperty() {
		
		return new ConfigDataProvider();
		
	}

}
