package ksrtc.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//webdriver object as variable
	private WebDriver driver;
	
	//page url
	private static String url="https://ksrtc.in/oprs-web/";
	
	//Locators
	@FindBy(how=How.LINK_TEXT ,using="New User Register")
	private WebElement newuserRegistrationLink;
	
	//constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
		driver.get(url);
		PageFactory.initElements(driver,this);
	}
	
	//user interactions
	public void clickOnNewUserRegistrationLink() {
		newuserRegistrationLink.click();
	}
	

}
