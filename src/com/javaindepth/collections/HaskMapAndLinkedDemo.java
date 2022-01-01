package com.javaindepth.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HaskMapAndLinkedDemo {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		
		System.out.println("Hash map entries : " + hashMap);
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);
		
		System.out.println("Linked hash map entries : " + linkedHashMap);
	}

}
