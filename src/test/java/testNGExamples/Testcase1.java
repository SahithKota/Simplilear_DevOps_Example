package testNGExamples;

import org.testng.annotations.Test;

public class Testcase1 extends Baseclass{
	

	@Test(groups= {"Sanity"})
	public void LoanTest() {
		System.out.println("Inside Loan Test");
	}
	
	@Test
	public void LoanTest1() {
		System.out.println("Inside Loan Test1");
	}
	
	@Test
	public void CreditCardTest() {
		System.out.println("Inside Credit Card Test");
	}
	

}
