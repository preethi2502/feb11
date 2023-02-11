package co.test.in;

import org.testng.annotations.Test;

public class SleepData {

	
	
	
	
	
	 
	@Test(expectedExceptions = ArithmeticException.class)
	private void openBrowser() {

		System.out.println(10 / 0);
	}

}
