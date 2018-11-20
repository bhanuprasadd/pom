package gccp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class ConformPage {

	WebDriver driver;
	public ConformPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * this method is clickonconform page.
	 * 
	 * 
	 * @return
	 */
	
	public WebDriver clickOnConform() {
			
		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
		}catch(Exception ex) {
			System.out.println("unable to click on continue");
			Assert.assertFalse(false);
		}
		return driver;
	}
	
}
