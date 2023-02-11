package com.rest.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ValidationA {
	@Test
	private void jsonReader() throws IOException, ParseException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\new\\TestNG\\PayLoad.json");
		FileReader reader = new FileReader(f);
		
		//JSON reader with object ( serialization ) 
		JSONParser json = new JSONParser();
		Object parse = json.parse(reader);
		JSONObject jobj = (JSONObject) parse;
		
		//get  ( deserialization ) 
		Object ob = jobj.get("name");
		String value = ob.toString();
		System.out.println(value);
		
		
		
		
		

	}

}
