package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverPackage.BaseDriver;

public class PO001_Locator extends BaseDriver{
	
	WebDriver driver;
	

	public PO001_Locator(WebDriver driver) {
		this.driver= driver;
	}
	
	By userName=By.id("inputUsername");
	By password=By.name("inputPassword");
	By termsCondition = By.id("chkboxOne");
	By clickSignIn = By.className("signInBtn");
	By clickForgotPassword = By.linkText("Forgot your password?");
	By inputUsername = By.xpath("//input[@placeholder='Name']");
	By enterEmail = By.xpath("//input[@type='text'][2]");
	By setMobileNumber = By.xpath("//input[@type='text'][3]");
	By clickResetBtn = By.cssSelector(".reset-pwd-btn");
	By loginBack = By.className("go-to-login-btn");
	
	

	public void setUserName(String name) {
		driver.findElement(userName).sendKeys(name);
	}
	
	public void givePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnTermsAndConditions() {
		driver.findElement(termsCondition).click();
	}
	
	public void clickSignInButton() {
		driver.findElement(clickSignIn).click();
	}
	
	public void clickFogretPassword() {
		driver.findElement(clickForgotPassword).click();
	}
	
	public void enterUserName(String name) {
		driver.findElement(inputUsername).sendKeys(name);
	}
	
	public void enterEmail(String email) {
		driver.findElement(enterEmail).sendKeys(email);
	}
	
	public void enterMobileNumber(String mobile) {
		driver.findElement(setMobileNumber).sendKeys(mobile);
	}
	
	public void clickResetButton() {
		driver.findElement(clickResetBtn).click();
	}
	public void clickLoginBack() {
		driver.findElement(loginBack).click();
	}
		
}
