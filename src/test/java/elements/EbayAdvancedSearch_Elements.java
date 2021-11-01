package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {
	WebDriver driver;
	@FindBy(xpath = "//span[@class='nav-line-2 nav-progressive-content']")
	public WebElement selectYourAddress;
	@FindBy(xpath = "//div[@class='a-popover-wrapper']")
	public WebElement Modal;
	@FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
	public WebElement pinCode;
	@FindBy(xpath = "//span[@id='GLUXZipUpdate']//input[@class='a-button-input']")
	public WebElement applyBtn;
//	@FindBy(xpath = "//span[.='Hello, Sign in']")
//	public WebElement signIN;
//	@FindBy(xpath = "//input[@id='ap_email']")
//	public WebElement eMail;
//	@FindBy(xpath = "//input[@id='continue']")
//	public WebElement Continue;
//	@FindBy(xpath = "//input[@id='ap_password']")
//	public WebElement passWord;
//	@FindBy(xpath = "//input[@id='signInSubmit']")
//	public WebElement submitBtn;

//	creating constructors
	public EbayAdvancedSearch_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
