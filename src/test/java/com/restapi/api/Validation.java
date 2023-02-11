package com.restapi.api;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;


public class Validation {

	@Test
	private void jsonReader() throws Exception {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\new\\TestNG\\PayLoad.json");
		FileReader reader = new FileReader(f);
		
		
		//JSON Reader with OBJECT ( serialization )
		JSONParser json = new JSONParser();
		Object parse = json.parse(reader);
		JSONObject jobj = (JSONObject) parse;
		
		
		//get
		//pass the key get the value
		Object ob = jobj.get("name");
		String value = ob.toString();
		System.out.println(value);
		
		
		
		
		

	}

}
