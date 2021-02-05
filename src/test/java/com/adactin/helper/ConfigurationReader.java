package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties ps;

	public ConfigurationReader() throws IOException {
		File f = new File("src\\test\\java\\com\\adactinproperty\\Adactin.Property");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
	}

	public String getBrowserName() {
		String BrowserName = ps.getProperty("BrowserName");
	//	System.out.println(BrowserName);
		return BrowserName;
	}

	public String getUrl() {
		String url = ps.getProperty("Url");
	//	System.out.println(url);
		return url;
	}

	/*
	 * public static void main(String[] args) throws IOException {
	 * ConfigurationReader cr = new ConfigurationReader(); cr.getBrowserName();
	 * cr.getUrl();
	 * 
	 * }
	 */
}
