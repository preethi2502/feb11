package co.test.in;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDemo {
	// data provider
	// set of data , multiple set of data
	// object 2d array Object2[][]
	@Test(dataProvider = "Client Data")
	private void userdata(String username, String password) {
		System.out.println("user name " + username);
		System.out.println("password " + password);
	}

	@DataProvider(name = "My Data")
	private Object[][] myData() {
		return new Object[][] { { "abc", "123" }, { "bcd", "456" }, { "edc", "987" } };
	}

	@DataProvider(name = "Client Data")
	private Object[][] clientData() {
		return new Object[][] { { "client a", "987987" }, { "client B", "65421023" } };
	}

}
