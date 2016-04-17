package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinderPage {

	WebDriver driver;

	By continueButton = By.name("findFlights");

	public FlightFinderPage(WebDriver driver) {
		this.driver = driver;
	}

	public void contButton() {
		driver.findElement(continueButton).click();
	}

}
