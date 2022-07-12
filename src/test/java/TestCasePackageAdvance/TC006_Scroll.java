package TestCasePackageAdvance;

import org.testng.annotations.Test;
import java.time.Duration;
import pageObjectPackage.PO006_Scroll;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC006_Scroll extends BaseDriver{
	
	public static String url = "https://www.seleniumhq.org";
	
	@Test
	public void scrollBottomTopSpecificIteam() throws InterruptedException {
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		PO006_Scroll scroll = new PO006_Scroll(driver);
		
		scroll.scrollToBottom();
		
		scroll.scrollToTop();
		
		scroll.ScrollToSpecificElement();
		
		Thread.sleep(5000);
		
		
		
	}
}
