package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	public String getProperty(String key) throws IOException {
		String path = "C:\\Users\\anile\\OneDrive\\Documents\\Anilet\\TestNgFramework\\properties\\application.properties";
		FileInputStream fileInput = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fileInput);
		String value=prop.getProperty(key);
		return value;
	}

}
