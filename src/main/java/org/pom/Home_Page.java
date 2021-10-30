package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	public Home_Page(WebDriver driver2) {
		this.driver = driver2; // null - driver convert to user driver 

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement sign_btn;

	@FindBy(xpath = "//a[.='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[.='Evening Dresses'])[1]")
	private WebElement evening_dress;

	public WebElement getWomen() {
		return women; 
	}

	public WebElement getEvening_dress() {
		return evening_dress;
	}

	public WebElement getSign_btn() {
		return sign_btn;
	}

}
