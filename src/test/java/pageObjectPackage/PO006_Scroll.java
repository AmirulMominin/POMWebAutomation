package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverPackage.BaseDriver;

public class PO006_Scroll extends BaseDriver{

	WebDriver driver;
	
	public PO006_Scroll(WebDriver driver) {
		this.driver = driver;
	}
	
	 

	 public void scrollToBottom() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		 Thread.sleep(5000);
	 }
	 
	 public void scrollToTop() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		 Thread.sleep(5000);
	 }
	 
	 public void ScrollToSpecificElement() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement e = driver.findElement(By.xpath("//h2[@class='selenium']"));
		 js.executeScript("arguments[0].scrollIntoView();",e);
		 Thread.sleep(5000);
	 }
}
