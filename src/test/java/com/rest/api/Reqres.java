package com.rest.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reqres {

	// response data
	@Test
	private void response_Body() {
//location using URL
		RestAssured.baseURI = "https://reqres.in/";
//Specification  ( given ) 		
		RequestSpecification request = RestAssured.given();

		Response response = request.get("https://reqres.in/api/users?page=2");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

		int statusCode = response.getStatusCode();
		System.out.println("status code " + statusCode);

		Assert.assertEquals(200, statusCode);

		System.out.println("data verified");

	}

}
