package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;



public class E2E {
	
	WebDriver driver;
	//private E2E_Pages e2e;
	private AccountPage accountPage;
	
	//private CommonUtils commonUtils;
	
	

	@When("User search for product and Add to cart")
	public void user_search_for_product_and_add_to_cart() 
	{
		driver = DriverFactory.getDriver();
		accountPage = new AccountPage(driver);
		
		accountPage.clickOnPhonesPDAs();
		accountPage.clickOnProduct();
		accountPage.addProductToCart();
	   
	}

	@Then("User should see the message  Success: You have added item to your shopping cart!")
	public void user_should_see_the_message_success_you_have_added_item_to_your_shopping_cart() {
	   
		// Assert.assertTrue(accountPage.successMessageForProcutAdd());  

		//Assert.assertTrue(accountPage.successMessageForProcutAdd().contains("Success: You have added HTC Touch HD to your shopping cart!"));
	}

	@Then("User click on Shopping cart")
	public void user_click_on_shopping_cart() {
		accountPage.clickOnShoppingCart();
	}

//	@Then("User should see the added product details")
//	public void user_should_see_the_added_product_details() 
//	{
//	    
//	}

	@Then("User click on checkout")
	public void user_click_on_checkout() {
		accountPage.clickOnCheckout();
		accountPage.selectExistingAddressOptionBillingDetails();
		accountPage.clickContinueButtonBilling();
		
		
	}

	@Then("User select the address and click on Continue")
	public void user_select_the_address_and_click_on_continue(DataTable dataTable) 
	{
//		Map<String,String> data = dataTable.asMap(String.class, String.class);
//		accountPage.enterFirstName(data.get("firstNameText"));
//		accountPage.enterLastName(data.get("lastNameText"));
//		accountPage.enterAddress(data.get("address"));
//		accountPage.enterCity(data.get("city"));
//		accountPage.enterPostcode(data.get("postalcode"));
//		accountPage.selectCountry();
//		accountPage.selectState();
		
		//accountPage.clickContinueButtonBilling();
		
	}

	@Then("User select delivery details and click on continue")
	public void user_select_delivery_details_and_click_on_continue() 
	{
		accountPage.selectExistingAddressOptionDeliveryDetails();
		accountPage.clickContinueButtonShipping();
	}

	@Then("User select delivery method and click on continue")
	public void user_select_delivery_method_and_click_on_continue() 
	{
		accountPage.clickContinueButtonDelivery();
	}

	@Then("User select payment method and agree to T&C and click on continue")
	public void user_select_payment_method_and_agree_to_t_c_and_click_on_continue() 
	{
		accountPage.selectAgreeCheckboxPayment();
		accountPage.clickContinueButtonPayment();
	}

	@Then("User validate the order details and click on Confirm Order")
	public void user_validate_the_order_details_and_click_on_confirm_order() {
		accountPage.clickConfirmOrder();
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String string) 
	{
	 Assert.assertTrue(accountPage.successMessageForConfirmOrder());  
	}

	@Then("User click on Continue")
	public void user_click_on_continue() {
		accountPage.clickContinueAfterOrderConfirmation();
	}
}
