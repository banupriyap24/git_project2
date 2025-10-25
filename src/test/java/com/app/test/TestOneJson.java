package com.app.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestOneJson {
	
	public static void main(String[] args) {
		try {
			FileReader read = new FileReader( new File("src/test/resources/TestData/test.json"));
			JSONParser jp = new JSONParser();
			Object object = jp.parse(read);
			JSONObject jo = (JSONObject)object;
			String train = (String)jo.get("Training");
			System.out.println(train);
			String course = (String)jo.get("Course");
			System.out.println(course);
			JSONArray ja = (JSONArray)jo.get("Students");
			for (Object x : ja) {
				System.out.println(x);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
