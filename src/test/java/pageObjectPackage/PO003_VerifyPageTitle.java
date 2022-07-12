package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import driverPackage.BaseDriver;

public class PO003_VerifyPageTitle extends BaseDriver{
	
	WebDriver driver;

	public PO003_VerifyPageTitle(WebDriver driver) {
		this.driver=driver;
	}
	
	public String foundTitleFromWeb = driver.getTitle();
	
	public void checkTitle() {
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(foundTitleFromWeb, "My Store");
		softly.assertAll();
	}
	
	public void isWebSiteSecured() {
		String url=driver.getCurrentUrl();
		
		if(url.contains("https")) {
			System.out.println("System is Secured");
		}
		else {
			System.out.println("System is not Secured");
		}
	}
	
	

}
