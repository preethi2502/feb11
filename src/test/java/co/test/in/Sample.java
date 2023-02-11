package co.test.in;

import javax.swing.plaf.multi.MultiRootPaneUI;

import org.testng.annotations.Test;

public class Sample {
	@Test(retryAnalyzer = MyRetry.class)
	private void sampleTestA() {
		System.out.println(10 / 0);
	}

	
	
	@Test(retryAnalyzer = MyRetry.class)
	private void sampleTestB() {
		System.out.println(10 / 5);
	}

}
