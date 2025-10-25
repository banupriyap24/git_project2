package com.app.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaTestTwo {
	
	static {		
		
	}
	
	
	
	public static void main(String[] args) {
		
//		Integer b [] = {11,21,34,42}; 
//		
//		//how to covert the array into list
//		List<Integer> li = new ArrayList<Integer>(Arrays.asList(b));
//		Collections.rotate(li, -1);
//		System.out.println(li);
		
		String s = "AAiiteeeref";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Character> set = new HashSet<Character>();
		for(char c :s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
			if(map.get(c)>1) {
				set.add(c);
			}
		}
		System.out.println(set);
		
		
//		char[] charArray = s.toCharArray();
//		for (char c : charArray) {
//			map.put(c, map.getOrDefault(c, 0)+1);
//		}
//		Set<Entry<Character,Integer>> entrySet = map.entrySet();
//		for (Entry<Character, Integer> entry : entrySet) {
//			if(entry.getValue()>1) {
//				System.out.println(" " + entry.getKey()+" "+ entry.getValue());
//			}
//		}

		
	}

}
