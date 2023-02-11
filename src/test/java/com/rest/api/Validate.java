package com.rest.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class Validate {
	@Test
	private void payloadValidate() throws IOException, ParseException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\new\\TestNG\\DataPayLoad.json");

		FileReader reader = new FileReader(f);

		JSONParser json = new JSONParser();

		// object reader
		Object parse = json.parse(reader);

		// interface
		JSONObject jsonob = (JSONObject) parse;

		Object obj = jsonob.get("name");

		// get the output ( pass the key , get the value )

		String value = obj.toString();
		System.out.println(value);

	}

}
