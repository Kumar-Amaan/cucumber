package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.EbayHome_Elements;
import steps.Common_steps;

public class EbayHome_Actions {

	private WebDriver driver;
//	
	EbayHome_Elements ebayhome_elements;

	public EbayHome_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		ebayhome_elements = new EbayHome_Elements(driver);

	}

	public void clickElectronicsLink() {
		ebayhome_elements.electronicsLink.click();
	}

	public void searchAnItem(String srcString) {
		ebayhome_elements.searchBox.sendKeys(srcString);
	}

	public void clickSearchBtn() {
		ebayhome_elements.searchBox.sendKeys(Keys.RETURN);
	}
	public void clickSmartPhones_BasMobiles() {
		ebayhome_elements.smartPhones_BasicMobiles.click();
	}
	public void clickCategory() {
		ebayhome_elements.allCategory.click();
	}
	public void selectCategoryOptions(String option) {
		List<WebElement> category =ebayhome_elements.allCategoryOptions;
//		apply loop to find the category

		for (WebElement x : category) {
			if (x.getText().trim().toLowerCase().equals(option.toLowerCase())) {
				x.click();
				break;
			}
		}
		ebayhome_elements.searchBox.sendKeys(option);
		ebayhome_elements.searchBox.sendKeys(Keys.RETURN);
		
	}
	public void clickOnLinkByText(String Text) {
		driver.findElement(By.linkText(Text)).click();
	}

	public void clickSignIN() {
		ebayhome_elements.signIN.click();
	}

	public void enterEmail(String string) {
		ebayhome_elements.eMail.sendKeys(string);
	}

	public void clickContinue() {
		ebayhome_elements.Continue.click();
	}

	public void enterPassword(String password) {
		ebayhome_elements.passWord.sendKeys(password);
	}

	public void clickSubmit() {
		ebayhome_elements.submitBtn.click();
	}

}
