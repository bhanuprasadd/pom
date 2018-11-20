package gccp.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import gccp.lib.utils.DriverClass;

public class EnvironmentSetup extends DriverClass {
	WebDriver driver;
	String Location = "System.setProperty(\"webdriver.chrome.driver\", \"\\\\\\\\\\\\\\\\USHOUHOME01\\\\\\\\devalbr\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\chrome_latest\\\\\\\\chromedriver.exe\");";
	String browser = "chrome";

	/************************************************************
	 * @author singhp1 Setup() method will return the driver object.
	 * @return
	 * 
	 * @return
	 ************************************************************/
	/*
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"\\\\\\\\USHOUHOME01\\\\devalbr\\\\Desktop\\\\Selenium\\\\chrome_latest\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	return driver;
	}
	*/
	public WebDriver setup() {
		
		System.setProperty("webdriver.chrome.driver",
				"\\\\\\\\USHOUHOME01\\\\devalbr\\\\Desktop\\\\Selenium\\\\chrome_latest\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
    	
    }
	

/*
	public String getLocation() {
		return Location;
	}



	public void setLocation(String location) {
		Location = location;
	}



	public String getBrowser() {
		return browser;
	}



	public void setBrowser(String browser) {
		this.browser = browser;
	}

*/

	/************************************************************
	 * @author singhp1 teardown() method will close the browser.
	 * 
	 * @return
	 ************************************************************/

	public void tearDown() {

		driver.close();

	}

}
