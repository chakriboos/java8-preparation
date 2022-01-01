package com.javaindepth.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("One", 1);
		treeMap.put("Two", 2);
		treeMap.put("Three", 3);
		treeMap.put("Four", 4);
		
		System.out.println("Tree map entries : " + treeMap);
		
	}

}
