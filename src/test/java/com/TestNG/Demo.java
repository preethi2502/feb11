package com.TestNG;

import org.testng.annotations.Test;

public class Demo {
	@Test(timeOut = 3000)
	private void red() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("red");
	}



}
