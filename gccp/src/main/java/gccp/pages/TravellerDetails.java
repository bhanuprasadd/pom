package gccp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TravellerDetails {

	
	
	WebDriver driver;
	public TravellerDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void fillPassanConDetls() {
		
		try {
			
			Select sec = new Select(driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_DropDownListTitle")));
			sec.selectByValue("MR");
			
			driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName")).sendKeys("Ramesh");
			
			driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName")).sendKeys("Gupta");
			
			driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone")).sendKeys("8884449261");
			
			driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress")).sendKeys("autoamtion.qa@gmail.com");
			
			/*
			Select sec1 = new Select(driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_DropDownListCountry")));
			sec1.selectByVisibleText("India");
			*/
			
			Select sec2 = new Select(driver.findElement(By.className("cities_india")));
			sec2.selectByVisibleText("Bengaluru");
			
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("unable to fill ht epassenger detail.");
			
		}
	}
		
		public WebDriver fillAdultDetails() {
			
			try {
				
				driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxFirstName_0']")).sendKeys("shivani");
				
				driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxLastName_0']")).sendKeys("gupta");
				
				
				
				driver.findElement(By.xpath("//div[@id='continue-to-addons-page']")).click();
				
				
				
			}catch(Exception e) {
				
				System.out.println("unable to fill the audit  detail.");
				
			}
			return driver;
			
		
	}
}
