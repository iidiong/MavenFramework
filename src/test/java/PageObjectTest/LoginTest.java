package PageObjectTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	@Test
	public void bookFlight() throws Exception {
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
		Select passengers = new Select(driver.findElement(By.name("passCount")));
		passengers.selectByValue("2");
		
		Select departingFrom = new Select(driver.findElement(By.name("fromPort")));
		departingFrom.selectByVisibleText("New York");
		
		WebElement serviceClass = driver.findElement(By
				.xpath("//input[@value='Business']"));
		serviceClass.click();
		
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

	@Test (enabled = false)
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
