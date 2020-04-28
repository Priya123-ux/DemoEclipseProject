package ksrtc.tests;

import org.testng.annotations.Test;

import ksrtc.webpages.HomePage;
import ksrtc.webpages.SignUpPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewUserRegistration {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  
  @Test
  public void signUp() throws InterruptedException {
	  HomePage hmpage=new HomePage(driver);
	  hmpage.clickOnNewUserRegistrationLink();
	  Thread.sleep(4000);
	  SignUpPage sgnPage=new SignUpPage(driver);
	  Assert.assertTrue(sgnPage.ispageopened());
	  sgnPage.enterUserName("supriyabasireddy@gmail.com");
	  sgnPage.enterFullName("Supriya Reddy");
	  sgnPage.enterMobileNumber("8074959612");
	  sgnPage.clickOnAddButton();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
