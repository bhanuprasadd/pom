package gccp.tests;

import org.testng.annotations.Test;

import gccp.lib.EnvironmentSetup;
import gccp.pages.AddOns;
import gccp.pages.ConformPage;
import gccp.pages.HomePage;
import gccp.pages.TravellerDetails;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;

public class Test1 extends EnvironmentSetup {
	WebDriver driver;
	HomePage home;
	ConformPage conf;
	TravellerDetails travel;
	AddOns addon;
	@BeforeTest
	public void beforetest() {
		this.driver = setup();

	}

	@Test(priority = 0)
	public void sampleTest1() throws Exception {
		driver.get("https://spicejet.com");
		home = new HomePage(this.driver);
		home.clickOnewayRadBtn();
		home.selectDepartCity();
		home.selectarrivalCity();
		home.selDepartDat();
		//home.addPassenCount();

		this.driver = home.clickOnSearch();
	}

	@Test(priority = 1)
	public void sampleTest2() {
		conf = new ConformPage(this.driver);
	 this.driver=conf.clickOnConform();

	}
	
	
	@Test(priority = 2)
	public void sampleTest3() throws Exception {
		travel = new TravellerDetails(this.driver);
	    travel.fillPassanConDetls();
	    this.driver = travel.fillAdultDetails();
	    
	    addon = new AddOns(this.driver);
	    Thread.sleep(4000);
	    addon.clickOntheAddMeals();
	    addon.clickOnContinue();
	    
	    

	}
	
	

	@AfterTest
	public void aftertest() {

		// tearDown();
	}

}
