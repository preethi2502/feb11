package co.test.in;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo {
//black, red
	
	@Test(groups = "Black",retryAnalyzer = MyRetry.class)
	public void teamA() {
		System.out.println("Team A");
	}

	@Test(groups = "Black")
	public void teamB() {
		System.out.println("Team B");
	}

	@Test(groups = "Black")
	public void teamC() {
		System.out.println("Team C");
	}

	@Test(groups = "RED",dependsOnGroups = "Black")
	public void teamAA() {
		System.out.println("Team AA");
	}

	@Test(groups = "RED")
	public void teamAB() {
		System.out.println("Team AB");
	}

	@Test(groups = "RED")
	public void teamAC() {
		System.out.println("Team AC");
	}

}
