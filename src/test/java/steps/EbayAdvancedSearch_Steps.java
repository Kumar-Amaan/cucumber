package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayAdvancedSearch_Steps {
//	WebDriver driver;
	Common_Actions common_Actions;
	EbayAdvancedSearch_Actions ebayAdvancedSearch_Actions;
	EbayHome_Actions ebayHome_Actions;

	public EbayAdvancedSearch_Steps(Common_Actions common_Actions,
			EbayAdvancedSearch_Actions ebayAdvancedSearch_Actions, EbayHome_Actions ebayHome_Actions) {
		this.common_Actions = common_Actions;
		this.ebayAdvancedSearch_Actions = ebayAdvancedSearch_Actions;
	}

	@Given("I am on Amazon Electronics  Page")
	public void i_am_on_amazon_electronics_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(
//				"https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f");
		common_Actions.goToURL(
				"https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f");

//		common_Actions.manage().window().maximize();

	}

	@When("I click on Select Your Address")
	public void i_click_on_select_your_address() {
//		driver.findElement(By.xpath("//span[@class='nav-line-2 nav-progressive-content']")).click();
		ebayAdvancedSearch_Actions.clickAddress();
	}

	@Then("I am navigated to the Modal")
	public void i_am_navigated_to_the_modal() throws Exception {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//div[@class='a-popover-wrapper']"));
		ebayAdvancedSearch_Actions.modal();

		Thread.sleep(2000);
	}

	@Then("I entered PIN Code {int}")
	public void i_entered_pin_code(int pin) {

//		driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("826001");
		ebayAdvancedSearch_Actions.PINCode(pin);

	}

	@Then("I clicked on Apply")
	public void i_clicked_on_apply() {
//		driver.findElement(By.xpath("//span[@id='GLUXZipUpdate']//input[@class='a-button-input']")).click();
		ebayAdvancedSearch_Actions.clickApply();
	}

	@Then("I navigated to the same page")
	public void i_navigated_to_the_same_page() {
		// Write code here that turns the phrase above into concrete actions
		String expUrl = "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f";
		String actUrl = common_Actions.getCurrentUrl();
		if (!expUrl.equals(actUrl)) {
			System.out.println("Error-->Navigated to another page");
		}
		common_Actions.close();
	}

//	@When("I advance search an item")
//	public void i_advance_search_an_item(io.cucumber.datatable.DataTable dataTable) throws Exception {
//
////		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(dataTable.cell(1, 0));
//		ebayAdvancedSearch_Actions.clickSignIN();
////		driver.findElement(By.xpath("//input[@id='continue']")).click();
//		ebayAdvancedSearch_Actions.enterEmail(dataTable.cell(1, 0));
////		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(dataTable.cell(1, 1));
//		ebayAdvancedSearch_Actions.enterPassword(dataTable.cell(1, 1));
//		ebayAdvancedSearch_Actions.clickContinue();
//
////		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//		ebayAdvancedSearch_Actions.clickSubmit();
//	}

}
