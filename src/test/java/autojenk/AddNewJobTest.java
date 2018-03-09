package autojenk;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TODO add description
 *
 * @author obilas
 */
public class AddNewJobTest extends BaseTest {

	@Test
	public void addNewJob() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loadPage();

		DashboardPage dashboardPage = loginPage.login("obilas", "user123");
		String projectName = dashboardPage.addNewJob().freestyleConfigure().saveProject().getProjectName();
		Assert.assertEquals(projectName, "Project test test", "Incorrect project name");
	}
}
