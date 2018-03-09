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
public class DashboardPage extends BaseClass {
	@FindBy(css = ".icon-new-package.icon-md")
	private WebElement newItemIcon;
	@FindBy(css = "#job_Test td:nth-of-type(3) .model-link")
	private WebElement testJob;
	@FindBy(css = ".permalinks-list li:nth-of-type(1) a")
	private WebElement lastBuild;
	@FindBy(css = ".icon-terminal.icon-md")
	private WebElement consoleOutputIcon;
	@FindBy(css = ".console-output")
	private WebElement consoleOutputResult;

	public DashboardPage(WebDriver driver) {super(driver);}

	public String getConsoleOutputResult() {
		wait.until(ExpectedConditions.elementToBeClickable(testJob));
		testJob.click();
		wait.until(ExpectedConditions.visibilityOf(lastBuild));
		lastBuild.click();
		wait.until(ExpectedConditions.visibilityOf(consoleOutputIcon));
		consoleOutputIcon.click();

		return consoleOutputResult.getText();
	}

	public NewJobPage addNewJob() {
		wait.until(ExpectedConditions.elementToBeClickable(newItemIcon));
		newItemIcon.click();

		return new NewJobPage(driver);
	}
}
