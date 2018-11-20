package gccp.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gccp.lib.utils.ReadProperties;

public class HomePage {

	WebDriver driver;
	ReadProperties read ;
	//ReadProperties read = new ReadProperties();
	static HashMap<String, String> properties = new HashMap<String, String>();
	static HashMap<String, String> objectrepo = new HashMap<String, String>();
	

	public HomePage(WebDriver driver) throws IOException {

		this.driver = driver;
		objectrepo =ReadProperties.readObjectMap();
		
	}

	/**************************************************************************************
	 * @author : bhanu prasad
	 * @description : ClickOneWayRadio Button method will click on the oneway radio
	 *              button .
	 * @return Webdriver.
	 * @throws Exception
	 ***************************************************************************************/

	public WebDriver clickOnewayRadBtn() throws Exception {

		try {
			
			//WebElement eOnewayRadbtn = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
			  WebElement eOnewayRadbtn = driver.findElement(By.xpath(objectrepo.get("spicejet.homepage.onewayrdbtn")));
			eOnewayRadbtn.click();
		} catch (Exception e) {
			System.out.println("unable to click the one way radio button." + e.getMessage());
			throw (e);
		}
		return driver;

	}

	public void selectDepartCity() {
		try {

			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

			driver.findElement(By.xpath("//a[@value='HYD']")).click();

		} catch (Exception e) {

			System.out.println("Unable to find the departure element.");

		}
	}

	public void selectarrivalCity() {
		try {

			driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();

		} catch (Exception e) {

			System.out.println("Unable to find the arrival element.");

		}

	}

	public void selDepartDat() {

		try {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		} catch (Exception e) {
			System.out.println("unable to click the date." + e.getMessage());
		}
	}

	public void addPassenCount() {
		try {

			driver.findElement(By.id("divpaxinfo")).click();
			WebElement ePassCount = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
			// for(int i=0;i<1;i++) {
			ePassCount.click();
			// }
			// Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Done']")).click();
		} catch (Exception e) {
			System.out.println("Unable to add the pass details." + e.getMessage());
		}

	}

	public WebDriver clickOnSearch() {
		try {

			driver.findElement(By.id("divpaxinfo")).click();
			WebElement eSerachbtn = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));

			eSerachbtn.click();
		} catch (Exception e) {
			System.out.println("Unable to add the pass details." + e.getMessage());
		}
		return driver;

	}

}
