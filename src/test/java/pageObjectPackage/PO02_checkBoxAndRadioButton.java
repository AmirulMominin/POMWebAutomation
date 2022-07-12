package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverPackage.BaseDriver;

public class PO02_checkBoxAndRadioButton extends BaseDriver{

	WebDriver driver;
	
	public PO02_checkBoxAndRadioButton(WebDriver driver) {
		this.driver = driver;
	}
	
	By radioButton = By.xpath("//body[1]/div[1]/fieldset[1]/label[3]/span[1]");
	By checkBox1 = By.xpath("//body[1]/div[1]/fieldset[2]/label[1]/span[1]");
	By checkBox2 = By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");
	
	public void clickRadioButton() {
		driver.findElement(radioButton).click();
	}
	
	public void clickCheckBox1() {
		driver.findElement(checkBox1).click();
	}
	
	public void clickCheckBox2() {
		driver.findElement(checkBox2).click();
	}
}
