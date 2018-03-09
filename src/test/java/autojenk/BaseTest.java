package autojenk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * TODO add description
 *
 * @author obilas
 */
public class BaseTest {
	protected WebDriver driver;
	protected WebDriverWait wait;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 2");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
