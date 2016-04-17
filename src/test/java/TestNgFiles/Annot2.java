package TestNgFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annot2 {
	@BeforeSuite
	public void installSoftware(){
		System.out.println("Suite starts here - I am the first");
	}
	@AfterSuite
	public void deinstallSoftware(){
		System.out.println("Suite ends here - I am the Last");
	}

}
