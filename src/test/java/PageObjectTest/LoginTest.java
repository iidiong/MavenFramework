package PageObjectTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObjectUtil.PageObjectUtil;
import PageObjects.FlightFinderPage;
import PageObjects.LoginPage;

public class LoginTest extends PageObjectUtil {

	@Test
	public void LoginApp() throws Exception {
		setup();
		LoginPage login = new LoginPage(driver);
		login.setUserId("test");
		login.setPassword("test");
		login.clickSubmit();

		login.verifyPageTitle("Find a Flight: Mercury Tours:");

		/*
		 * Assert.assertEquals("Find a Flight: Mercury Tours:",
		 * driver.getTitle());
		 */
		FlightFinderPage finder = new FlightFinderPage(driver);
		finder.contButton();
		
		takesScreenshot();

	}

	
	/*@Test
	public void testTakesScreenshot()throws Exception{
		setup();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("target/mail_page.png"));
	}*/

	@Test
	public void unsuccessfulLoginApp() throws Exception {
		setup();
		LoginPage login = new LoginPage(driver);
		login.setUserId("test");
		login.setPassword("abcd");
		login.clickSubmit();

		login.verifyPageTitle("Sign-on: Mercury Tours");

		
	}

	@Test 
	public void noPasswordLoginApp() throws IOException {
		setup();
		LoginPage login = new LoginPage(driver);
		login.setUserId("test");
		login.setPassword(" ");
		login.clickSubmit();

		login.verifyPageTitle("Sign-on: Mercury Tours");

	}

	// Another way to implement above test
	@Test (enabled = false)
	public void userLoginApp() throws IOException {
		setup();
		LoginPage login = new LoginPage(driver);
		login.userLogin("test", "test");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
