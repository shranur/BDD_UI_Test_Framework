package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;


public class Background {
	
	WebDriver driver;
	private LoginPage loginPage;
	private AccountPage accountPage;
	//private CommonUtils commonUtils;

	
	@Given("User navigate to Login page")
	public void user_navigate_to_login_page() 
	{
		driver = DriverFactory.getDriver();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		loginPage = homePage.selectLoginOption();
	}

	@When("User enters username and password")
	public void user_enters_username_and_password(DataTable dataTable) 
	{
		Map<String,String> data = dataTable.asMap(String.class, String.class);
		loginPage.enterEmailAddress(data.get("Username"));
		loginPage.enterPassword("Password");
		
		
	}

	@Then("User should logged in")
	public AccountPage user_should_logged_in() 
	{
		return accountPage = loginPage.clickOnLoginButton();
	}
	
	
}
