package stepdefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.PlacingOrderPage;

public class PlacingAnOrder 
{
	WebDriver driver;
	private AccountPage accountPage;
	private PlacingOrderPage placingAnOrderPage;
	
	
	@When("User select the product category")
	public void user_select_the_product_category() {
		
		driver = DriverFactory.getDriver();
		accountPage = new AccountPage(driver);
		placingAnOrderPage.hoverOnDesktopButton();
		//placingAnOrderPage.clickOnAllDesktops();
		
	    
	}

//	@Then("User verify available product names for the selected category")
//	public void user_verify_available_product_names_for_the_selected_category() {
//	  
//	}
//
//	@When("User select product name for ordering")
//	public void user_select_product_name_for_ordering() {
//	   
//	}
//
//	@Then("Verify the product is in Stock")
//	public void verify_the_product_is_in_stock() {
//	    
//	}
//
//	@Then("Add the product in cart")
//	public void add_the_product_in_cart() {
//	    
//	}
//
//	@Then("User should see the added product details")
//	public void user_should_see_the_added_product_details() {
//	   
//	}
//	
	
	
	
}
