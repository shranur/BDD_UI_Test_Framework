package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class PlacingOrderPage 
{

	WebDriver driver;
	private ElementUtils elementUtils;
	
	public PlacingOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy (xpath="//a[text()='Desktops']")
	private WebElement DesktopButton;
	
	@FindBy (xpath="//a[contains(text(),'Show AllDesktops')]")
	private WebElement allDesktopButton;
	
	
	
	public void hoverOnDesktopButton()
	{
		elementUtils.mouseHoverAndClick(DesktopButton,allDesktopButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	/*
	 * public void clickOnAllDesktops() { //phoneAndPdas.click();
	 * elementUtils.clickOnElement(allDesktopButton,CommonUtils.
	 * EXPLICIT_WAIT_BASIC_TIME); }
	 */
	
	
	
}
