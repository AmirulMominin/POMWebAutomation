package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import driverPackage.BaseDriver;

public class PO004_DropDown extends BaseDriver{
	WebDriver driver;
	
	public PO004_DropDown(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	public void selectSignleItem() throws InterruptedException {
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5);
		 WebElement e = driver.findElement(By.name("cars"));
		 Thread.sleep(5);
		 Select s = new Select(e);
		 Thread.sleep(5);
		s.selectByIndex(1);
		Thread.sleep(5);
		}
	
	public void selectMultipleItems() throws InterruptedException {
		WebElement e = driver.findElement(By.name("cars"));
		Select s = new Select(e);
	
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.CONTROL)
			.click(s.getOptions().get(1))
			.click(s.getOptions().get(2))
			.keyUp(Keys.CONTROL)
			.build()
			.perform();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();
	}
}
