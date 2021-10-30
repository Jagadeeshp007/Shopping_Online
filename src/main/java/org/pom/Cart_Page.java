package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public WebDriver driver;

	public Cart_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='qty']")
	private WebElement quntity;

	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;

	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement color;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement add_card;

	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	private WebElement proceed;

	public WebElement getQuntity() {
		return quntity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAdd_card() {
		return add_card;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
