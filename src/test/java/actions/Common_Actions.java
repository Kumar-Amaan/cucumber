package actions;

import org.openqa.selenium.WebDriver;

import steps.Common_steps;

public class Common_Actions {
	private WebDriver driver;
	Common_steps common_steps;

//create constructor
	public Common_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
	}

	public void goToURL(String url) {
		driver.get(url);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

	public void close() {
		driver.quit();
	}
}
