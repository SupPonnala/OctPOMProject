package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		//cannot create object and instead use PageFactory
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class );
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		// to validate if it landed on dashboard page
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickCustomerButtom();
		dashboardPage.clickAddCustomerButtom();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName("Bryan");
		addCustomerPage.chooseCompanyOption("Techfios");
		addCustomerPage.insertEmailAddress("bryan@none.com");
		addCustomerPage.insertPhoneNumber("1237778888");
		addCustomerPage.insertAddress("678 Sam Drive");
		addCustomerPage.chooseCountryOption("Yemen");
		
		
		//BrowserFactory.tearDown();
		
		
	}
		
	}


