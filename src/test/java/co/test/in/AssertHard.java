package co.test.in;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertHard {
	
	
	@Test
	private void data() {
		String exp ="Jack 123";
		String act = "Jack 123";
		
		
		Assert.assertEquals(exp, act);
	}
	
	
	
	
	

}
