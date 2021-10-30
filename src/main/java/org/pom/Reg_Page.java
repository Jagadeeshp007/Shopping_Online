package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_Page {

	public WebDriver driver; // null
	
	public Reg_Page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	private WebElement gender;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement first_name;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement last_name;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement day;
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement company;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement address1;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement landmark;
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement state;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement zip;
	
	@FindBy(xpath="//textarea[@id='other']")
	private WebElement info;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement mobile;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	private WebElement submit;
	
	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
