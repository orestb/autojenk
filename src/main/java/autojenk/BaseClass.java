package autojenk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * TODO add description
 *
 * @author obilas
 */
public class BaseClass {

	protected WebDriver driver;
	protected String PAGE_URL;
	WebDriverWait wait;

	public BaseClass(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void loadPage(){
		driver.get(getPageUrl());
	}

	public String getPageUrl(){
		return PAGE_URL;
	}
}
