package ksrtc.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	private WebDriver driver;
	
	//Locators
	
	@FindBy(xpath="//h5[@class='card-title text-center']")
	private WebElement heading;
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="fullName")
	private WebElement fullName;
	
	@FindBy(id="mobileNo")
	private WebElement mobileNumber;
	
	@FindBy(name="SaveBtn")
	private WebElement addButton;
	//Constructor
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		//initialise elements
		PageFactory.initElements(driver,this);
	}
	
	//user Interactions
	
	public void enterUserName(String UserName) {
		userName.clear();
		userName.sendKeys(UserName);
	}
	
	public void enterFullName(String name) {
		fullName.clear();
		fullName.sendKeys(name);
	}
	
	public void enterMobileNumber(String mobileno) {
		mobileNumber.clear();
		mobileNumber.sendKeys(mobileno);
	}
	
	public void clickOnAddButton() {
		addButton.click();
	}
	
	public boolean ispageopened() {
		//Assertion
		return heading.getText().toString().contains("SignUp");
	}

}
