package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property_Reader1 {

	public static Properties p;

	public Property_Reader1() throws Throwable {
		File f = new File(".\\src\\main\\java\\org\\property\\configure1.properties");
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

	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}

	public String getFname() {
		String fname = p.getProperty("fname");
		return fname;
	}

	public String getLname() {
		String lname = p.getProperty("lname");
		return lname;
	}

	public String getPass() {
		String password = p.getProperty("password");
		return password;
	}

	public String getDay() {
		String day = p.getProperty("day");
		return day;
	}

	public String getMonth() {
		String month = p.getProperty("month");
		return month;
	}

	public String getYear() {
		String year = p.getProperty("year");
		return year;
	}

	public String getCompany() {
		String company = p.getProperty("company");
		return company;
	}

	public String getAdd() {
		String address = p.getProperty("address");
		return address;
	}

	public String getLmark() {
		String landmark = p.getProperty("landmark");
		return landmark;
	}

	public String getCity() {
		String city = p.getProperty("city");
		return city;
	}

	public String getState() {
		String state = p.getProperty("state");
		return state;
	}

	public String getZipcode() {
		String zipcode = p.getProperty("zipcode");
		return zipcode;
	}

	public String getInfo() {
		String info = p.getProperty("info");
		return info;
	}

	public String getMobile() {
		String mobile = p.getProperty("mobile");
		return mobile;
	}

}
