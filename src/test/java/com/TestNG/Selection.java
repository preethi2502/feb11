package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Selection {

	// data provider --> Object 2D Array
	@Test(dataProvider = "client")
	private void login(String username, String password) {
		System.out.println("name: " + username + "pass " + password);
	}

	@DataProvider(name = "client")
	private Object[][] clientData() {
		return new Object[][] { { "ABC", "45112" }, { "BAN", "455" }

		};
	}

	@DataProvider(name = "dev")
	private Object[][] devData() {
		return new Object[][] { { "987", "451" }, { "test", "8745" } };
	}

	@DataProvider(name = "myData")
	private Object[][] myData() {
		return new Object[][] { { "myDATA1", "45112" }, { "myData2", "455" }

		};
	}
}
