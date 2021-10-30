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

public class Part2_TestNG extends Base_Class {

	public static WebDriver driver;
	public static Project_Object_Manger pom;

	ExtentTest Test;
	ExtentReports ExRep;
	ExtentSparkReporter sparkRep;
	
	@BeforeTest
	private void configuration() {
		sparkRep = new ExtentSparkReporter(".//Report//TestNG_Extent2.html");
		ExRep = new ExtentReports();
		ExRep.attachReporter(sparkRep);
		Test=ExRep.createTest("configuration");
	}
	
	@AfterTest
	private void Flush1() {
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
	
	@Test(priority = 4)
	private void dress_Select() throws Throwable {

		// women dress select
		mouse(pom.getHome().getWomen(), "move");
		mouse(pom.getHome().getEvening_dress(), "move");
		mouse(pom.getHome().getEvening_dress(), "click");
		sleep(3);

		// dress select
		mouse(pom.getDress().getImg(), "move");
		mouse(pom.getDress().getMore(), "move");
		mouse(pom.getDress().getMore(), "click");
		wait(30);

	}

	@Test(priority = 5)
	private void choose_dress() throws Throwable {

		// Quntity increase
		inputClear(pom.getCart().getQuntity());
		String quantity = File_Read.getFile().getInstance2().getQuantity();
		inputPass(pom.getCart().getQuntity(), quantity);

		// size change
		String size = File_Read.getFile().getInstance2().getSize();
		dropDown(pom.getCart().getSize(), "value", size);

		// color change
		mouse(pom.getCart().getColor(), "move");
		mouse(pom.getCart().getColor(), "click");
		sleep(3);

	}

	@Test(priority = 6)
	private void add_Card() throws Throwable {

		// add to card
		elementClick(pom.getCart().getAdd_card());
		wait(30);

		// proceed to card
		elementClick(pom.getCart().getProceed());
		sleep(3);

		mouse(pom.getSummary().getProceed(), "move");
		takeScreenShot(".\\screenshot\\order.png");
		mouse(pom.getSummary().getProceed(), "click");
		sleep(3);

	}

	@Test(priority = 7)
	private void login() throws Throwable {

		// login
		String username = File_Read.getFile().getInstance2().getUsername();
		inputPass(pom.getSign().getUsername(), username);
		String password = File_Read.getFile().getInstance2().getPassword();
		inputPass(pom.getSign().getPassword(), password);

		elementClick(pom.getSign().getLogin_btn());
		sleep(3);

	}

	@Test(priority = 8)
	private void conform_order() throws Throwable {

		// conform order
		String textarea = File_Read.getFile().getInstance2().getTextarea();
		inputPass(pom.getAdd().getText(), textarea);
		elementClick(pom.getAdd().getProceed());
		sleep(3);

	}

	@Test(priority = 9)
	private void shipping_order() throws Throwable {
		// shipping
		mouse(pom.getShip().getCheckbox(), "move");
		mouse(pom.getShip().getCheckbox(), "click");
		elementClick(pom.getShip().getProceed());
		sleep(3);

	}

	@Test(priority = 10)
	private void payment() throws Throwable {

		// payment proceed
		mouse(pom.getPay().getPayment(), "move");
		mouse(pom.getPay().getPayment(), "click");
		sleep(3);

		// submit
		elementClick(pom.getPay().getSubmit());
		sleep(3);

		scroll("down");
		scroll("up");
		sleep(2);

		takeScreenShot(".\\screenshot\\conform.png");
		sleep(3);

	}

	@AfterClass
	private void browserClose() {

		close();
	}

}
