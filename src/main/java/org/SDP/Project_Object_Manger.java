package org.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.pom.Address_Page;
import org.pom.Cart_Page;
import org.pom.Dress_Page;
import org.pom.Home_Page;
import org.pom.Payment_Page;
import org.pom.Reg_Page;
import org.pom.Shipping_Page;
import org.pom.Sign_Page;
import org.pom.Summary_page;

public class Project_Object_Manger {

	public WebDriver driver; // null

	public Project_Object_Manger(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	private Home_Page home;

	private Sign_Page sign;

	private Reg_Page reg;

	private Dress_Page dress;

	private Cart_Page cart;

	private Summary_page summary;

	private Address_Page add;

	private Shipping_Page ship;

	private Payment_Page pay;

	public Home_Page getHome() {
		home = new Home_Page(driver); // access null driver in runner file
		return home;
	}

	public Sign_Page getSign() {
		sign = new Sign_Page(driver);
		return sign;
	}

	public Reg_Page getReg() {
		reg = new Reg_Page(driver);
		return reg;
	}

	public Dress_Page getDress() {
		dress = new Dress_Page(driver);
		return dress;
	}

	public Cart_Page getCart() {
		cart = new Cart_Page(driver);
		return cart;
	}

	public Summary_page getSummary() {
		summary = new Summary_page(driver);
		return summary;
	}

	public Address_Page getAdd() {
		add = new Address_Page(driver);
		return add;
	}

	public Shipping_Page getShip() {
		ship = new Shipping_Page(driver);
		return ship;
	}

	public Payment_Page getPay() {
		pay = new Payment_Page(driver);
		return pay;
	}
}
