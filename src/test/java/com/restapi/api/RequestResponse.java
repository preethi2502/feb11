package com.restapi.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestResponse {

	@Test
	private void response_Body() {
		// locating the URL
		RestAssured.baseURI = "https://reqres.in/";
		// specification of method given
		RequestSpecification request = RestAssured.given();

		// the response using get method
		Response response = request.get("https://reqres.in/api/unknown/23");

		// response check in the console
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

		int statusCode = response.getStatusCode();
		System.out.println("status code " + statusCode);

	}

}
