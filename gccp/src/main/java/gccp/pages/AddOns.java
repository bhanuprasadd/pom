package gccp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOns {
	
	WebDriver driver;
	public AddOns(WebDriver driver) {
		this.driver = driver;
	}
	//hotMealsBtn
	
	public void  clickOnContinue() {
		
		try {	
			driver.findElement(By.xpath("//div[@id='continue-to-payment-page']")).click();
		}catch(Exception ex) {
			System.out.println("Unable to click.");
		}
	}

	
public void  clickOntheAddMeals() throws Exception {
		
		try {	
			driver.findElement(By.xpath("(//input[@id='hotMealsBtn'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[text()='Select Meal'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='CONTROLGROUPPASSENGER$MealLegInputViewPassengerView$SsrQuantity_passengerNumber_0_ssrCode_VGSW_ssrNum_1_flightReference_20181031-SG3603-HYDGOI']")).click();
			
			//.findElement(By.xpath("(//a[text()='+'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//a[text()='I am done'])[1]")).click();
			
		}catch(Exception ex) {
			System.out.println("Unable to click.");
			throw(ex);
		}
	}


}
