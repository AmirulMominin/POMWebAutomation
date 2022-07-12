package TestCasePackageAdvance;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driverPackage.BaseDriver;

public class TC003_PageTitleAndSecuredPage extends BaseDriver{
	
	public static String url = "http://automationpractice.com/index.php";
	
	@Test
	public void verifyTitle() throws InterruptedException {
		driver.get(url);
		new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
	
		String foundTitleFromWeb = driver.getTitle();
		
		SoftAssert softy = new SoftAssert();
		
		AssertJUnit.assertEquals(foundTitleFromWeb, "My Store");
		softy.assertAll();
			
		}
	@Test	
	public void verifySecurity() {
		if(url.contains("https")) {
			System.out.println("System is Secured");
		}else {
			System.out.println("System is not Secured! Do somthing!");
		}
	}	
		
		
	
}
