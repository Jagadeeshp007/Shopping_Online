package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Page {
	public WebDriver driver; // null

	public Sign_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email_create")
	private WebElement email;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-default')])[2]")
	private WebElement reg_btn;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement login_btn;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getReg_btn() {
		return reg_btn;
	}
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
