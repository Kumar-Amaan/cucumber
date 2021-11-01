package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Common_Actions;
import actions.EbayHome_Actions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

	Common_Actions common_Actions;
	EbayHome_Actions ebayHome_Actions;

	public EbayHome_Steps(Common_Actions common_Actions, EbayHome_Actions ebayHome_Actions) {
		this.common_Actions = common_Actions;
		this.ebayHome_Actions = ebayHome_Actions;
	}

	@Given("I am on Amazon Home Page")
	public void i_am_on_amazon_home_page() {
		// Write code here that turns the phrase above into concrete actions
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
		common_Actions.goToURL("https://www.amazon.in/");
//		driver.manage().window().maximize();
	}

	@When("I click on Electronics in navbar")
	public void i_click_on_electronics_in_navbar() {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[contains(.,'Electronics')]")).click();
		ebayHome_Actions.clickElectronicsLink();
	}

	@Then("I navigate to Electronics Page")
	public void i_navigate_to_electronics_page() {
		// Write code here that turns the phrase above into concrete actions
		String expUrl = "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f";
		String actUrl = common_Actions.getCurrentUrl();
		if (!expUrl.equals(actUrl)) {
			System.out.println("Page not navigated to the Electronics page!!!!");
		}
		common_Actions.close();

	}

	@When("I searched for {string}")
	public void i_searched_for_apple_i_phone11(String str1) {
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(str1);
		ebayHome_Actions.searchAnItem(str1);
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.RETURN);
		ebayHome_Actions.clickSearchBtn();
	}

	@Then("I clicked on Smartphones & Basic Mobiles")
	public void i_clicked_on_smartphones_basic_mobiles() {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//span[.='Smartphones & Basic Mobiles']")).click();
		ebayHome_Actions.clickSmartPhones_BasMobiles();
//		driver.quit();
		common_Actions.close();
	}

	@When("I searched for {string} in {string} category")
	public void i_searched_for_in_category(String string, String string2) throws Exception {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(string);

//		click on All Category..
//		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		ebayHome_Actions.clickCategory();
//		List<WebElement> category = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		ebayHome_Actions.selectCategoryOptions(string2);
//		apply loop to find the category
//
//		for (WebElement x : category) {
//			if (x.getText().trim().toLowerCase().equals(string2.toLowerCase())) {
//				x.click();
//				break;
//			}
//		}
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(string);
		ebayHome_Actions.searchAnItem(string);
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.RETURN);
		ebayHome_Actions.clickSearchBtn();
		Thread.sleep(2000);

	}

	@When("I click on {string}")
	public void i_click_on(String string) {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.linkText(string)).click();
		ebayHome_Actions.clickElectronicsLink();
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		// Write code here that turns the phrase above into concrete actions
		String actUrl = common_Actions.getCurrentUrl();
		String acttitle = common_Actions.getCurrentPageTitle();

		if (!actUrl.equals(url)) {
			System.out.println("Page not navigated to expected URL: " + url);

		}
		if (!acttitle.contains(title)) {
			System.out.println("Title Mismatch");
		}
//		driver.quit();
		common_Actions.close();
	}

	@When("I clicked on Sign in")
	public void i_clicked_on_sign_in(io.cucumber.datatable.DataTable dataTable) throws Exception {
		ebayHome_Actions.clickSignIN();

		ebayHome_Actions.enterEmail(dataTable.cell(1, 0));
		ebayHome_Actions.clickContinue();
		Thread.sleep(2000);
////	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(dataTable.cell(1, 1));
		
		ebayHome_Actions.enterPassword(dataTable.cell(1, 1));
		
//
////	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		ebayHome_Actions.clickSubmit();
	}

}
