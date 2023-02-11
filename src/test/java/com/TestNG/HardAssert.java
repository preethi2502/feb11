package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	private void userName(String name) {
		String exp = "Jack 123";
		String act = "Jack 456";
		Assert.assertEquals(act, exp);
		
		

	}
	
	
	
	
	
	
	
	
	
}
