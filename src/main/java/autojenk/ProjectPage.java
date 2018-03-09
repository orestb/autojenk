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
public class ProjectPage extends BaseClass {
	@FindBy(className = "job-index-headline.page-headline")
	private WebElement projectName;
	@FindBy(css = ".icon-edit-delete.icon-md")
	private WebElement deleteProjectIcon;

	public ProjectPage(WebDriver driver) {super(driver);}

	public String getProjectName() {
		wait.until(ExpectedConditions.visibilityOf(projectName));

		return projectName.getText();
	}

	public void deleteProject() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteProjectIcon));
		deleteProjectIcon.click();
		driver.switchTo().alert().accept();
	}
}
