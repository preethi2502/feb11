package com.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectA  extends Baseclass{

	
	@Test(priority = 1)
	private void browserLaunch() {
		getBrowser("chrome");
	}
	
	@Test(priority = 2)
	private void url() {
		openUrl("url");
	}
	
	@Test(priority = 3)
	private void data() {
		
	}
	
	
}
