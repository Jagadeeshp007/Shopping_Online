package org.step_def1;

import org.SDP.Project_Object_Manger;
import org.base.Base_Class;
import org.helper.File_Read;
import org.openqa.selenium.WebDriver;
import org.test_runner.Test_Runner1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_Part1 extends Base_Class {

	public static WebDriver driver = Test_Runner1.driver;
	public static Project_Object_Manger pom = new Project_Object_Manger(driver);

	@Before
	public void beforHooks(Scenario s) throws Throwable {
		String status = s.getStatus();
		System.out.println("Before Hooks : " + status);
		if (s.isFailed()) {
			takeScreenShot(".\\screenShot\\beforHooks.png");
		}
	}

	@After
	public void afterHooks(Scenario s) throws Throwable {
		String status = s.getStatus();
		System.out.println("After Hooks : " + status);
		if (s.isFailed()) {
			takeScreenShot(".\\screenShot\\afterHooks.png");
		}
	}

	@Given("^user Launch The Shopping Application$")
	public void user_Launch_The_Shopping_Application() throws Throwable {
		String url = File_Read.getFile().getInstance1().getUrl();
		getUrl(url);
		sleep(3);

	}

	@Then("^user Click The Sign Up Button To Navigate Sign Up page$")
	public void user_Click_The_Sign_Up_Button_To_Navigate_Sign_Up_page() throws Throwable {
		elementClick(pom.getHome().getSign_btn());
		wait(30);

	}

	@When("^user Enter The Email In Email Field$")
	public void user_Enter_The_Email_In_Email_Field() throws Throwable {
		String email = File_Read.getFile().getInstance1().getEmail();
		inputPass(pom.getSign().getEmail(), email);

	}

	@Then("^user Click The Sign Up Button To Navigate Registration Page$")
	public void user_Click_The_Sign_Up_Button_To_Navigate_Registration_Page() throws Throwable {
		elementClick(pom.getSign().getReg_btn());
		wait(30);
	}

	@When("^user Select The Gender$")
	public void user_Select_The_Gender() throws Throwable {
		elementClick(pom.getReg().getGender());

	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		String fname = File_Read.getFile().getInstance1().getFname();
		inputPass(pom.getReg().getFirst_name(), fname);

	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		String lname = File_Read.getFile().getInstance1().getLname();
		inputPass(pom.getReg().getLast_name(), lname);
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		String pass = File_Read.getFile().getInstance1().getPass();
		inputPass(pom.getReg().getPassword(), pass);
	}

	@When("^user Select The Day$")
	public void user_Select_The_Day() throws Throwable {
		String day = File_Read.getFile().getInstance1().getDay();
		dropDown(pom.getReg().getDay(), "value", day);
	}

	@When("^user Select The Month$")
	public void user_Select_The_Month() throws Throwable {
		String month = File_Read.getFile().getInstance1().getMonth();
		dropDown(pom.getReg().getMonth(), "value", month);
	}

	@When("^user Select the Year$")
	public void user_Select_the_Year() throws Throwable {
		String year = File_Read.getFile().getInstance1().getYear();
		dropDown(pom.getReg().getYear(), "value", year);
	}

	@When("^user Enter The Company In Comapny Field$")
	public void user_Enter_The_Company_In_Comapny_Field() throws Throwable {
		String company = File_Read.getFile().getInstance1().getCompany();
		inputPass(pom.getReg().getCompany(), company);
	}

	@When("^user Enter The Address In Address Field$")
	public void user_Enter_The_Address_In_Address_Field() throws Throwable {
		String add = File_Read.getFile().getInstance1().getAdd();
		inputPass(pom.getReg().getAddress1(), add);
	}

	@When("^user Enter The Land Mark In Land Mark Field$")
	public void user_Enter_The_Land_Mark_In_Land_Mark_Field() throws Throwable {
		String lmark = File_Read.getFile().getInstance1().getLmark();
		inputPass(pom.getReg().getLandmark(), lmark);
	}

	@When("^user Enter The City In City Field$")
	public void user_Enter_The_City_In_City_Field() throws Throwable {
		String city = File_Read.getFile().getInstance1().getCity();
		inputPass(pom.getReg().getCity(), city);
	}

	@When("^user Enter The Zipcode In Zipcode Field$")
	public void user_Enter_The_Zipcode_In_Zipcode_Field() throws Throwable {
		String state = File_Read.getFile().getInstance1().getState();
		dropDown(pom.getReg().getState(), "value", state);
	}

	@When("^user Enter The Information In Information Field$")
	public void user_Enter_The_Information_In_Information_Field() throws Throwable {
		String zipcode = File_Read.getFile().getInstance1().getZipcode();
		inputPass(pom.getReg().getZip(), zipcode);
	}

	@When("^user Enter The Mobile Number In Mobile Number Field$")
	public void user_Enter_The_Mobile_Number_In_Mobile_Number_Field() throws Throwable {
		String info = File_Read.getFile().getInstance1().getInfo();
		inputPass(pom.getReg().getInfo(), info);
	}

	@Then("^user Click The Submit Button To Registration Successfull$")
	public void user_Click_The_Submit_Button_To_Registration_Successfull() throws Throwable {
//		System.exit(0);
//		elementClick(pom.getReg().getSubmit());
//		sleep(3);

		// screenshot
		takeScreenShot("\\screenshot\\reg1.png");
		sleep(8);
	}

}
