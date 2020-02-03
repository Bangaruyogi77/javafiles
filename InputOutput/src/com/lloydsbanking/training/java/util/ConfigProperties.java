package com.lloydsbanking.training.java.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * @author shant
 * 
 */

public class ConfigProperties {
	String result = "";
	static InputStream inputStream;
	static Properties prop;

	public ConfigProperties() {

	}

	public static String getPropValue(String property) throws IOException {

		String returnValue = null;
		if (prop == null) {
			try {

				String propFileName = "config.properties";

				inputStream = ConfigProperties.class.getClass().getResourceAsStream(propFileName);

				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
				}

			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				if (inputStream != null)
					inputStream.close();
			}
		} 
		else
			returnValue = prop.getProperty(property);
		return returnValue;
	}
}