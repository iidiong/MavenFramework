package TestNgFiles;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("in before suite");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("in after suite");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("in Before Class");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("in After Class");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("=====in before test");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("in before method");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("in after method");
	}
	@Test
	public void testCase1(){
	// TO open the browser
	System.out.println("in test case 1");
	}
	@Test
	public void testCase2(){
		System.out.println("in test case 2");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("in after test=======");
	}
}
