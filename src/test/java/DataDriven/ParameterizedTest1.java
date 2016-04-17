package DataDriven;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {

	@Test
	@Parameters({"myName", "lastName"})
	public void parameterTest(@Optional("Idong") String myName, @Optional("Idong") String lastName) {

		System.out.println("Parameterized value is : " + myName + " " + lastName);

	}

	@Test
	public void flightBooking() {
		System.out.println("Test 3");
	}
}
