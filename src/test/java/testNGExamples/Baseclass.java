package testNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	@BeforeGroups("Sanity")
	public void beforeGroup() {
		System.out.println("Inside Before group");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside Before test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before method");
	}
	
	
	@AfterMethod
    public void afterMethod() {
		System.out.println("Inside After method");
	}
	
	@AfterTest
    public void afterTest() {
		System.out.println("Inside After method");
	}
}
