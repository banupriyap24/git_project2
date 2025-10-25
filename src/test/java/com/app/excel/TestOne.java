package com.app.excel;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestOne {
	
	public static void main(String[] args) {
		
		char c [] = {'a','a','k','a','f','d'};
		Character [] co = new Character[c.length];
		for(int i=0; i< c.length;i++) {
			co[i]=c[i];
		}
		// stream -- collection -- max , min , sort, duplicates 
		
		String result =Arrays.stream(co)
				.distinct()
				.sorted().map(String::valueOf).collect(Collectors.joining());
		System.out.println(result);
		
		
	}

}
