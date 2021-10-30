package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {

	public WebDriver driver;

	public Shipping_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath = "(//span[contains(.,'Proceed to checkout')])[2]")
	private WebElement proceed;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed() {
		return proceed;
	}
}
