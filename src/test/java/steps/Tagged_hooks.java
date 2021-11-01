package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_hooks {
	WebDriver driver;

	public Tagged_hooks(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
	}

	@Before(value = "@setCookies", order = 1)
	public void setCookies() {
		System.out.println("Scenario Effect Hook- Specification");
	}

	@After(value = "@Test", order = 0)
	public void testAfterHook() {
		System.out.println("Scenario Specific After Hook Executed");
	}
}
