package pageObjectPackage;

import org.openqa.selenium.WebDriver;

import driverPackage.BaseDriver;

public class PO005_Refresh extends BaseDriver{
	
	WebDriver driver;
	
	public PO005_Refresh(WebDriver driver) {
		this.driver = driver;
	} 
	public void timeSleep() throws InterruptedException {
		Thread.sleep(5);
	}
	
	public void goToGoogle() throws InterruptedException {
		driver.navigate().to("https://www.google.com/");
		timeSleep();
	}
	
	public void refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	public void back() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void forward() throws InterruptedException {
		driver.navigate().forward();
		Thread.sleep(3000);
	}
	
}
