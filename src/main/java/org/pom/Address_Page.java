package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;

	public Address_Page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@name='message']")
	private WebElement text;

	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement proceed;

	public WebElement getText() {
		return text;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
