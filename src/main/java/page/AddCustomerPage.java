package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_FIELD_LOCATOR;

	// interactive Methods
	public void insertFullName(String fullName) {
		int generatedNumber = randomGenerator(999);
		FULLNAME_FIELD_LOCATOR.sendKeys(fullName + generatedNumber);
	}
	public void chooseCompanyOption(String company) {
		selectDropDown(COMPANY_FIELD_LOCATOR, company);

	}

	public void insertEmailAddress(String email) {
		int generatedNumber = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generatedNumber + email);
	}

	public void insertPhoneNumber(String phone ) {
		int generatedNumber = randomGenerator(999);
		PHONE_FIELD_LOCATOR.sendKeys(generatedNumber + phone);
	}
	public void insertAddress(String address ) {
		int generatedNumber = randomGenerator(999);
		ADDRESS_FIELD_LOCATOR.sendKeys(generatedNumber + address);
	}
	public void chooseCountryOption(String country) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, country);

	}
	
	
}
