package testNGExamples;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass{

	@Test(groups= {"Sanity"})
	public void InsuranceTest() {
		System.out.println("Inside Insurance Test");
	}
	
	public void InsuranceTest2() {
		System.out.println("Inside Insurance Test2");
	}
	
}
