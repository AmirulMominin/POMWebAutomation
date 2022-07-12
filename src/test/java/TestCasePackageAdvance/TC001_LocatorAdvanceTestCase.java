package TestCasePackageAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO001_Locator;

public class TC001_LocatorAdvanceTestCase extends BaseDriver{

	public String url = "https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void Locator() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		PO001_Locator locator = new PO001_Locator(driver);
		
		locator.setUserName("Shifa");
		locator.givePassword("jsdfksdjf");
		locator.clickOnTermsAndConditions();
		locator.clickSignInButton();
		locator.clickFogretPassword();
		Thread.sleep(2000);
		locator.enterUserName("Shifa");
		locator.enterEmail("test12121212@gmailll.com");
		locator.enterMobileNumber("01212321313");
		locator.clickResetButton();
		locator.clickLoginBack();
		Thread.sleep(4000);
		locator.setUserName("Shifa");
		Thread.sleep(4000);
		locator.givePassword("rahulshettyacademy");
		Thread.sleep(4000);
		locator.clickSignInButton();
		
		Thread.sleep(4000);
	}
}
