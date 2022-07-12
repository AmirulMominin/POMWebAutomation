package TestCasePackageAdvance;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO004_DropDown;

public class TC004_DropDown extends BaseDriver{
	public static String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	
	@Test
	public void selectValueFromDropDown() throws InterruptedException {
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		
		PO004_DropDown selectItemfromDropDown = new PO004_DropDown(driver);

		
		selectItemfromDropDown.selectSignleItem();
		Thread.sleep(10);
		
		selectItemfromDropDown.selectMultipleItems();
		Thread.sleep(5);
	}
	
}
