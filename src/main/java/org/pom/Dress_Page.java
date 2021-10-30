package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {

	public WebDriver driver;
	
	public Dress_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement img;
	
	@FindBy(xpath="(//a[@itemprop='url'])[3]")
	private WebElement more;
	
	public WebElement getImg() {
		return img;
	}

	public WebElement getMore() {
		return more;
	}

}
