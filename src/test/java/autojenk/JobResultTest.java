package autojenk;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TODO add description
 *
 * @author obilas
 */
public class JobResultTest extends BaseTest {

	@Test
	public void testJobResult() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loadPage();

		DashboardPage dashboardPage = loginPage.login("obilas", "user123");
		Assert.assertTrue(dashboardPage.getConsoleOutputResult().contains("hello\n" +
				"Finished: SUCCESS"), "Incorrect job result");
	}

}
