package TestCasePackageAdvance;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO02_checkBoxAndRadioButton;

public class TC002_CheckBoxAndRadioButton extends BaseDriver{
	
	public static String url="https://jqueryui.com/checkboxradio"; 
	
	@Test
	public void checkBoxAndRadio() throws InterruptedException {
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		PO02_checkBoxAndRadioButton boxCheck = new PO02_checkBoxAndRadioButton(driver);
		
		boxCheck.clickRadioButton();
		Thread.sleep(1000);
		boxCheck.clickCheckBox1();
		Thread.sleep(1000);
		boxCheck.clickCheckBox2();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
	}
	
}
