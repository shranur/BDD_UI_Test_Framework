package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class AccountPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public AccountPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
	}
	
	@FindBy(xpath = "//nav/div/ul/li/a[contains(text(),'Phones & PDAs')]")
	private WebElement phoneAndPdas;

	@FindBy(xpath = "//div[@class='caption']/h4//a[contains(text(),'HTC Touch HD')]")
	private WebElement productName;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageOfProductAdd;

	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;

	@FindBy(xpath = "//a[contains(text(),'Checkout')]")
	private WebElement checkoutButton;
	
//	@FindBy(xpath="//input[@id='button-payment-address']")
//	private WebElement continueButton;

	@FindBy(xpath = "//input[@id='input-payment-firstname']")
	private WebElement enterFirstName;

	@FindBy(xpath = "//input[@id='input-payment-lastname']")
	private WebElement enterLastName;

	@FindBy(xpath = "//input[@id='input-payment-address-1']")
	private WebElement Address1;

	@FindBy(xpath = "//input[@id='input-payment-city']")
	private WebElement City;

	@FindBy(xpath = "//input[@id='input-payment-postcode']")
	private WebElement Postcode;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	private WebElement Country;
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
	private WebElement State;
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	private WebElement continueButtonBilling;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement continueButtonShipping;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement continueButtonDelivery;
	
	@FindBy(name="agree")
	private WebElement agreeCheckboxPayment;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement continueButtonPayment;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement confirmOrderButton;
	
	@FindBy (xpath="//h1[contains(text(),'Your order has been placed!')]")
	private WebElement confirmOrderMessage;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement finalContinueButton;
	
	@FindBy(xpath="//input[@type='radio' and @value='new']")
	private WebElement newAddressCheckbox;
	
	@FindBy(xpath="//input[@type='radio' and @value='existing']")
	private WebElement existingAddressCheckboxBillingDetails;
	
	//@FindBy(xpath="//a[text()=\"Step 3: Delivery Details \"] //..//..//following-sibling::div//input[@type='radio' and @value='existing']")
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/label[1]")
	private WebElement checkboxExistingAddressDeliveryDetails;
	
	

	public void clickOnPhonesPDAs() {
		//phoneAndPdas.click();
		 elementUtils.clickOnElement(phoneAndPdas,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnProduct() {
		// productName.click();
		
		elementUtils.clickOnElement(productName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void addProductToCart() {

		elementUtils.clickOnElement(addToCart, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean successMessageForProcutAdd() {
		return elementUtils.displayStatusOfElement(successMessageOfProductAdd, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnShoppingCart() {

		// shoppingCart.click();
		elementUtils.clickOnElement(shoppingCart, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnCheckout() {

		// shoppingCart.click();
		elementUtils.clickOnElement(checkoutButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterFirstName(String firstNameText) {

		elementUtils.typeTextIntoElement(enterFirstName, firstNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterLastName(String lastNameText) {

		elementUtils.typeTextIntoElement(enterLastName, lastNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterAddress(String address) {

		elementUtils.typeTextIntoElement(Address1, address, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterCity(String city) {

		elementUtils.typeTextIntoElement(City, city, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterPostcode(String postalcode) {

		elementUtils.typeTextIntoElement(Postcode, postalcode, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}
	
	public void selectCountry()
	{
		elementUtils.selectOptionInDropdown(Country, "India", CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void selectState()
	{
		elementUtils.selectOptionInDropdown(State, "Madhya Pradesh", CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickContinueButtonBilling()
	{
		elementUtils.clickOnElement(continueButtonBilling, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	public void clickContinueButtonShipping()
	{
		elementUtils.clickOnElement(continueButtonShipping, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickContinueButtonDelivery()
	{
		elementUtils.clickOnElement(continueButtonDelivery, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void selectAgreeCheckboxPayment()
	{
		elementUtils.clickOnElement(agreeCheckboxPayment, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickContinueButtonPayment()
	{
		elementUtils.clickOnElement(continueButtonPayment, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickConfirmOrder()
	{
		elementUtils.clickOnElement(confirmOrderButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean successMessageForConfirmOrder() {
		return elementUtils.displayStatusOfElement(confirmOrderMessage, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	public void clickContinueAfterOrderConfirmation()
	{
		elementUtils.clickOnElement(finalContinueButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean displayStatusOfEditYourAccountInformationOption() {
		
		return false;
	}
	
	public void selectNewAddressOption()
	{
		elementUtils.clickOnElement(newAddressCheckbox, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void selectExistingAddressOptionBillingDetails()
	{
		elementUtils.clickOnElement(existingAddressCheckboxBillingDetails, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void selectExistingAddressOptionDeliveryDetails()
	{
		elementUtils.clickOnElement(checkboxExistingAddressDeliveryDetails, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}
