package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_steps {
	private WebDriver driver;

	@Before(order=0)
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Global Before Hook Executed");
	}

	@After(order=1)
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(2000);
		System.out.println("Global After Hook Executed");
	}



	public WebDriver getDriver() {
		return driver;
	}
}
