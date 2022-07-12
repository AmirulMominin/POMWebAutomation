package TestCasePackageAdvance;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO005_Refresh;

public class TC005_Refresh extends BaseDriver{

	public static String url = "https://www.w3schools.com";
	
	@Test
	public void refreshAndNavigation() throws InterruptedException {
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PO005_Refresh refreshAndNav = new PO005_Refresh(driver);
		
		refreshAndNav.goToGoogle();
		
		refreshAndNav.refresh();
		
		refreshAndNav.back();
		
		refreshAndNav.forward();
	}
}
