package com.TestNG;

import org.testng.annotations.Test;

public class Sample {

	@Test(retryAnalyzer = MyRetry.class)
	private void testA() {
		System.out.println(10/5);
	}

	@Test(retryAnalyzer = MyRetry.class)
	private void testB() {
		System.out.println(10/0);
	}

}
