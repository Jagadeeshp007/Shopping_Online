package org.step_def2;

import org.SDP.Project_Object_Manger;
import org.base.Base_Class;
import org.helper.File_Read;
import org.openqa.selenium.WebDriver;
import org.test_runner.Test_Runner2;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_Part2 extends Base_Class {

	public static WebDriver driver = Test_Runner2.driver;
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

	@When("^user Launch The Shopping Application$")
	public void user_Launch_The_Shopping_Application() throws Throwable {
		String url = File_Read.getFile().getInstance2().getUrl();
		getUrl(url);
		sleep(3);
	}

	@Then("^user click The Evening Dress To Navigate Dress Page$")
	public void user_click_The_Evening_Dress_To_Navigate_Dress_Page() throws Throwable {
		// women dress select
		mouse(pom.getHome().getWomen(), "move");
		mouse(pom.getHome().getEvening_dress(), "move");
		mouse(pom.getHome().getEvening_dress(), "click");
		sleep(3);
	}

	@When("^user Select The Dress$")
	public void user_Select_The_Dress() throws Throwable {
		// dress select
		mouse(pom.getDress().getImg(), "move");
		mouse(pom.getDress().getMore(), "move");
		mouse(pom.getDress().getMore(), "click");
		wait(30);
	}

	@When("^user Change The Dress Quntity$")
	public void user_Change_The_Dress_Quntity() throws Throwable {
		// Quntity increase
		inputClear(pom.getCart().getQuntity());
		String quantity = File_Read.getFile().getInstance2().getQuantity();
		inputPass(pom.getCart().getQuntity(), quantity);

	}

	@When("^user Change The Dress Size$")
	public void user_Change_The_Dress_Size() throws Throwable {
		// size change
		String size = File_Read.getFile().getInstance2().getSize();
		dropDown(pom.getCart().getSize(), "value", size);
	}

	@When("^user Change The Dress Color$")
	public void user_Change_The_Dress_Color() throws Throwable {
		// color change
		mouse(pom.getCart().getColor(), "move");
		mouse(pom.getCart().getColor(), "click");
		sleep(3);
	}

	@Then("^user Click The AddCard Button To  Order Page$")
	public void user_Click_The_AddCard_Button_To_Order_Page() throws Throwable {
		// add to card
		elementClick(pom.getCart().getAdd_card());
		wait(30);
	}

	@Then("^user Click The Proceed To Card Button To Navigate Login Page$")
	public void user_Click_The_Proceed_To_Card_Button_To_Navigate_Login_Page() throws Throwable {
		// proceed to card
		elementClick(pom.getCart().getProceed());
		sleep(3);

		mouse(pom.getSummary().getProceed(), "move");
		takeScreenShot(".\\screenshot\\order.png");
		mouse(pom.getSummary().getProceed(), "click");
		sleep(3);

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		// user name
		String username = File_Read.getFile().getInstance2().getUsername();
		inputPass(pom.getSign().getUsername(), username);
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		// password
		String password = File_Read.getFile().getInstance2().getPassword();
		inputPass(pom.getSign().getPassword(), password);
	}

	@Then("^user Click The SignIn Button To Navigate Order Conform Page$")
	public void user_Click_The_SignIn_Button_To_Navigate_Order_Conform_Page() throws Throwable {
		// sign In button
		elementClick(pom.getSign().getLogin_btn());
		sleep(3);
	}

	@When("^user Enter The Text In Textare Field$")
	public void user_Enter_The_Text_In_Textare_Field() throws Throwable {
		// Text area
		String textarea = File_Read.getFile().getInstance2().getTextarea();
		inputPass(pom.getAdd().getText(), textarea);
	}

	@Then("^user Click The Proceed Button To Navigate Shipping Page$")
	public void user_Click_The_Proceed_Button_To_Navigate_Shipping_Page() throws Throwable {
		// shipping button
		elementClick(pom.getAdd().getProceed());
		sleep(3);
	}

	@When("^user Click The CheckBox$")
	public void user_Click_The_CheckBox() throws Throwable {
		// checkbox
		mouse(pom.getShip().getCheckbox(), "move");
		mouse(pom.getShip().getCheckbox(), "click");
	}

	@Then("^user Click The Proceed Button To Navigate Payment Page$")
	public void user_Click_The_Proceed_Button_To_Navigate_Payment_Page() throws Throwable {
		// payment button
		elementClick(pom.getShip().getProceed());
		sleep(3);
	}

	@Then("^user Click The payment Button To Navigate Conform Page$")
	public void user_Click_The_payment_Button_To_Navigate_Conform_Page() throws Throwable {
		// payment proceed
		mouse(pom.getPay().getPayment(), "move");
		mouse(pom.getPay().getPayment(), "click");
		sleep(3);
	}

	@Then("^user Click The Submit Button To Conform Order$")
	public void user_Click_The_Submit_Button_To_Conform_Order() throws Throwable {
		// submit
		elementClick(pom.getPay().getSubmit());
		sleep(3);

		scroll("down");
		scroll("up");
		sleep(2);

		takeScreenShot(".\\screenshot\\conform.png");

		sleep(3);
		close();
	}

}
