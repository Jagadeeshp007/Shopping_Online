package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property_Reader2 {

	public static Properties p;

	public Property_Reader2() throws Throwable {
		File f = new File(".\\src\\main\\java\\org\\property\\configure2.properties");
		FileInputStream input = new FileInputStream(f);
		p = new Properties();
		p.load(input);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		String uname = p.getProperty("username");
		return uname;
	}

	public String getPassword() {
		String pass = p.getProperty("pass");
		return pass;
	}

	public String getTextarea() {
		String textarea = p.getProperty("textarea");
		return textarea;
	}

	public String getSize() {
		String size = p.getProperty("size");
		return size;
	}

	public String getQuantity() {
		String qty = p.getProperty("quntity");
		return qty;
	}
}
