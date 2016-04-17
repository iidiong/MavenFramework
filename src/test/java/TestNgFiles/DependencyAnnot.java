package TestNgFiles;

import org.testng.annotations.Test;

public class DependencyAnnot {
	@Test
	public void openingBrowser(){
	// TO open the browser
	System.out.println("Executing opening brwoser");
	}
	@Test(dependsOnMethods= {"openingBrowser"})
	public void flightBooking(){
		System.out.println("Executing flight Booking");
	}
	@Test(enabled = false)
	public void payment(){
		System.out.println("Executing new test flight Booking");
	}

}
