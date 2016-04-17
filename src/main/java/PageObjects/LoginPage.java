package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	By username = By.name("userName");
	By passwd = By.name("password");
	By signinButton = By.name("login");
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserId(String userId) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(userId);

	}

	public void setPassword(String password) {
		driver.findElement(passwd).clear();
		driver.findElement(passwd).sendKeys(password);
	}

	public void clickSubmit() {
		driver.findElement(signinButton).click();
	}

	public void verifyPageTitle(String PageTitle) {
		//Assert.assertEquals(PageTitle, driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains(PageTitle));
		Assert.assertTrue(driver.getTitle().contentEquals(PageTitle));
	}

	// single method implementation
	public void userLogin(String userId, String password) {
		driver.findElement(username).sendKeys(userId);
		driver.findElement(passwd).sendKeys(password);
		driver.findElement(signinButton).click();
	}
}
