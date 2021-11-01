package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	WebDriver driver;

	@FindBy(xpath = "//div[@id='nav-xshop']/a[contains(.,'Electronics')]")
	public WebElement electronicsLink;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchBox;
	@FindBy(xpath = "//span[.='Smartphones & Basic Mobiles']")
	public WebElement smartPhones_BasicMobiles;
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	public WebElement allCategory;
	@FindBy(xpath = "//select[@id='searchDropdownBox']/option")
	public List<WebElement> allCategoryOptions;
	@FindBy(xpath = "//span[.='Hello, Sign in']")
	public WebElement signIN;
	@FindBy(xpath = "//input[@id='ap_email']")
	public WebElement eMail;
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement Continue;
	@FindBy(xpath = "//input[@id='ap_password']")
	public WebElement passWord;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	public WebElement submitBtn;
//@FindBy(xpath="//input[@id='twotabsearchtextbox']") public WebElement searchBox;

	public EbayHome_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
