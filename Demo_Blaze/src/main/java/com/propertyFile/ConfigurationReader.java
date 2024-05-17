package com.propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File("D:\\Demo_Blaze\\userData.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String get_url() {

		String property = p.getProperty("url");
		return property;

	}

	public String get_username() {

		String property = p.getProperty("username");
		return property;

	}

	public String get_password() {
		String property = p.getProperty("password");
		return property;

	}

	public String get_name() {
		String property = p.getProperty("name");
		return property;

	}

	public String get_country() {
		String property = p.getProperty("country");
		return property;

	}

	public String get_city() {
		String property = p.getProperty("city");
		return property;

	}

	public String get_card() {
		String property = p.getProperty("card");
		return property;

	}

	public String get_month() {
		String property = p.getProperty("month");
		return property;

	}

	public String get_year() {
		String property = p.getProperty("year");
		return property;

	}

}
