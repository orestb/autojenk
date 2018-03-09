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
public class ConfigurePage extends BaseClass {
	@FindBy(css = ".hetero-list-add[suffix='builder']")
	private WebElement addBuildStepList;
	@FindBy(css = ".first-of-type li:nth-of-type(2)")
	private WebElement executeShellItem;
	@FindBy(css = ".CodeMirror-scroll.cm-s-default")
	private WebElement commandInputField;
	@FindBy(name = "Submit")
	private WebElement saveButton;

	public ConfigurePage(WebDriver driver) {super(driver);}

	public ProjectPage saveProject() {
		wait.until(ExpectedConditions.visibilityOf(addBuildStepList));
		addBuildStepList.click();
		wait.until(ExpectedConditions.visibilityOf(executeShellItem));
		executeShellItem.click();
		wait.until(ExpectedConditions.visibilityOf(commandInputField));
		commandInputField.sendKeys("echo \"TEST\"");
		saveButton.click();

		return new ProjectPage(driver);
	}
}
