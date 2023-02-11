package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	private void userData() {

		SoftAssert sa = new SoftAssert();
		String exp = "Jack 456";
		String act = "Jack 845";
		sa.assertEquals(act,exp);
		System.out.println("verified");
		
		sa.assertAll();

	}

	
}
