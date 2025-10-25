package com.app.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read_Prop {
	public static void main(String[] args) {
		read_prop_reuse("url");
		
	}
	
	public static void read_prop() {
		try {
			FileReader read = new FileReader( new File("src/test/resources/TestData/config.properties"));
		
		Properties prop = new Properties();
		prop.load(read);
		String url = prop.getProperty("url");
		System.out.println(url);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String read_prop_reuse(String data) {
		String value= null;
		try {
			FileReader read = new FileReader( new File("src/test/resources/TestData/config.properties"));
		
		Properties prop = new Properties();
		prop.load(read);
		value = prop.getProperty(data);
		System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}
