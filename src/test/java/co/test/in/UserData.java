package co.test.in;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserData {

	// parameter @Optional
	// xml

	@Parameters("name")
	@Test
	private void userName(@Optional("ANU") String name) {
		System.out.println("user name " + name);
	}

	@Parameters("number")
	@Test
	private void userPassword(@Optional("456") int number) {
		System.out.println("int number " + number);
	}

}
