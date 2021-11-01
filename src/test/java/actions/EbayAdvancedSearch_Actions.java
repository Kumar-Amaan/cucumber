package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvancedSearch_Elements;
import steps.Common_steps;

public class EbayAdvancedSearch_Actions {
	private WebDriver driver;

	EbayAdvancedSearch_Elements ebayadvancedsearch_elements;

	public EbayAdvancedSearch_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		ebayadvancedsearch_elements = new EbayAdvancedSearch_Elements(driver);
	}

	public void clickAddress() {
		ebayadvancedsearch_elements.selectYourAddress.click();
	}

	public void modal() {
		ebayadvancedsearch_elements.Modal.click();
	}

	public void PINCode(int pin) {
		ebayadvancedsearch_elements.pinCode.sendKeys("pin");
	}

	public void clickApply() {
		ebayadvancedsearch_elements.applyBtn.click();
	}
//
//	public void clickSignIN() {
//		ebayadvancedsearch_elements.signIN.click();
//	}
//
//	public void enterEmail(String string) {
//		ebayadvancedsearch_elements.eMail.sendKeys(string);
//	}
//
//	public void clickContinue() {
//		ebayadvancedsearch_elements.Continue.click();
//	}
//
//	public void enterPassword(String password) {
//		ebayadvancedsearch_elements.passWord.sendKeys(password);
//	}
//
//	public void clickSubmit() {
//		ebayadvancedsearch_elements.submitBtn.click();
//	}

}
