package DataDriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void cookies() {
		System.out.println("This block excutes before all test cases");
	}

	@BeforeMethod
	public void befor() {
		System.out.println("this is before method");
	}

	@AfterMethod
	public void after() {
		System.out.println("this is after method");
	}

	@Test(groups = "Priority1")
	public void openingBrowser() {
		// TO open the browser
		System.out.println("Test P1");
	}

	@Test
	public void closingBrowser() {
		// TO open the browser
		System.out.println("Test P1");
	}

	@Test
	public void flightBooking() {
		System.out.println("Test 3");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is after test=======");
	}
}
