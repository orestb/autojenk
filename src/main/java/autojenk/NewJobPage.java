package autojenk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * TODO add description
 *
 * @author obilas
 */
public class NewJobPage extends BaseClass {
	@FindBy(name = "name")
	private WebElement jobNameField;
	@FindBy(css = ".icon-freestyle-project.icon-xlg")
	private WebElement freestyleIcon;
	@FindBy(css = ".btn-decorator")
	private WebElement okButton;

	public NewJobPage (WebDriver driver) {super(driver);}

	public ConfigurePage freestyleConfigure() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(jobNameField));
		jobNameField.sendKeys("test test");
        freestyleIcon.click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();
        //okButton.click();
		return new ConfigurePage(driver);
	}
}
