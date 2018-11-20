package gccp.lib.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class DriverClass implements FirefoxDriver{
	static WebDriver driver;
	public WebDriver setup(String BrowserType,String browserLocation) {
		if(BrowserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",browserLocation );
			//driver = new FirefoxDriver();
		}else if(BrowserType.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",browserLocation );
		}else if(BrowserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","\\\\\\\\USHOUHOME01\\\\devalbr\\\\Desktop\\\\Selenium\\\\chrome_latest\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
}
