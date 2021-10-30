package org.testng_runner;

import org.SDP.Project_Object_Manger;
import org.base.Base_Class;
import org.helper.File_Read;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Part1_TestNG extends Base_Class {

	public static WebDriver driver;
	public static Project_Object_Manger pom;

	ExtentTest Test;
	ExtentReports ExRep;
	ExtentSparkReporter sparkRep;

	@BeforeTest
	private void configuration() {
		sparkRep = new ExtentSparkReporter(".//Report//TestNG_Extend1.html");
		ExRep = new ExtentReports();
		ExRep.attachReporter(sparkRep);
		Test = ExRep.createTest("configuration");
	}

	@AfterTest
	private void flush() {
		ExRep.flush();
	}

	@BeforeClass
	private void browserLaunch() throws Throwable {
		String browser = File_Read.getFile().getInstance1().getBrowser();
		driver = getBrowser(browser);
		pom = new Project_Object_Manger(driver);

		String url = File_Read.getFile().getInstance1().getUrl();
		getUrl(url);
	}

	@Test(priority = 1)
	private void signUp() throws Throwable {
		// sign up
		elementClick(pom.getHome().getSign_btn());
		wait(30);
		
		// email id
		String email = File_Read.getFile().getInstance1().getEmail();
		inputPass(pom.getSign().getEmail(), email);

		// button
		elementClick(pom.getSign().getReg_btn());
		wait(30);

	}

	@Test(priority = 2)
	private void registration() throws Throwable {
		// Gender
		elementClick(pom.getReg().getGender());

		// First name
		String fname = File_Read.getFile().getInstance1().getFname();
		inputPass(pom.getReg().getFirst_name(), fname);

		// Last name
		String lname = File_Read.getFile().getInstance1().getLname();
		inputPass(pom.getReg().getLast_name(), lname);

		// password
		String pass = File_Read.getFile().getInstance1().getPass();
		inputPass(pom.getReg().getPassword(), pass);

		// Date of Birth
		String day = File_Read.getFile().getInstance1().getDay();
		dropDown(pom.getReg().getDay(), "value", day);
		String month = File_Read.getFile().getInstance1().getMonth();
		dropDown(pom.getReg().getMonth(), "value", month);
		String year = File_Read.getFile().getInstance1().getYear();
		dropDown(pom.getReg().getYear(), "value", year);

		// company
		String company = File_Read.getFile().getInstance1().getCompany();
		inputPass(pom.getReg().getCompany(), company);

		// address
		String add = File_Read.getFile().getInstance1().getAdd();
		inputPass(pom.getReg().getAddress1(), add);

		// Land Mark
		String lmark = File_Read.getFile().getInstance1().getLmark();
		inputPass(pom.getReg().getLandmark(), lmark);

		// city
		String city = File_Read.getFile().getInstance1().getCity();
		inputPass(pom.getReg().getCity(), city);

		// state
		String state = File_Read.getFile().getInstance1().getState();
		dropDown(pom.getReg().getState(), "value", state);

		// zip
		String zipcode = File_Read.getFile().getInstance1().getZipcode();
		inputPass(pom.getReg().getZip(), zipcode);

		// addition information
		String info = File_Read.getFile().getInstance1().getInfo();
		inputPass(pom.getReg().getInfo(), info);

		// mobile number
		String mobile = File_Read.getFile().getInstance1().getMobile();
		inputPass(pom.getReg().getMobile(), mobile);

//		System.exit(0); // terminate the process

		// submit
//		elementClick(pom.getReg().getSubmit());
//		sleep(3);

		// screenshot
		takeScreenShot("\\screenshot\\reg1.png");
		sleep(3);

	}

	@AfterClass
	private void browserClose() {

		close();
	}
}
