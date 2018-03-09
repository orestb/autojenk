package autojenk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * TODO add description
 *
 * @author obilas
 */
public class LoginPage extends BaseClass {

	@FindBy(id = "j_username")
	private WebElement userNameField;
	@FindBy(name = "j_password")
	private WebElement passwordField;
	@FindBy(name = "Submit")
	private WebElement submitButton;

	public LoginPage (WebDriver driver) {
		super(driver);
		PAGE_URL = "http://172.22.43.65:8080";
	}

    public void enterUserName(String username) {userNameField.sendKeys(username);}

    public void enterPassword(String password) {passwordField.sendKeys(password);}

    public void clickSubmitButton() {submitButton.click();}

    public DashboardPage login(String user, String pwd) {
		enterUserName(user);
		enterPassword(pwd);
		clickSubmitButton();
		DashboardPage dashboardPage = new DashboardPage(driver);
		return dashboardPage;
	}

	public void waitForInputFieldsToDisplay() {
		wait.until(ExpectedConditions.visibilityOf(userNameField));
	}

	@Override
	public void loadPage() {
		super.loadPage();
		waitForInputFieldsToDisplay();
	}

}
