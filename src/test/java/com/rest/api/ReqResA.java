package com.rest.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqResA {

	@Test
	private void getA() {
		System.out.println("a");
		// path or location of the URL
		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification given = RestAssured.given();

		// refname + http method
		Response response = given.get("https://reqres.in/api/users/2");

		String asString = response.asString();
		System.out.println(asString);
		System.out.println(response);

	}

}
