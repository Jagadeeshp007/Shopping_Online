package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {

	public WebDriver driver;

	public Payment_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(.,'Pay by bank wire')]")
	private WebElement payment;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
