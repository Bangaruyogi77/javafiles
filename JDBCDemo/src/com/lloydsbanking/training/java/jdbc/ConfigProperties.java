package com.lloydsbanking.training.java.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {

	private static ConfigProperties cProperties;
	private static Properties properties = new Properties();
	
	private ConfigProperties() {
		InputStream iStream = ConfigProperties.class.getResourceAsStream("\\config.properties");
		try {
			properties.load(iStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String property) {
		if (cProperties == null) {
			cProperties = new ConfigProperties();
		}
		return properties.getProperty(property);
	}

}
