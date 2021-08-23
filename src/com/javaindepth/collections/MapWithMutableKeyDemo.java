package com.javaindepth.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithMutableKeyDemo {

	public static void main(String[] args) {

		//Create map with mutable key
		Map<List<Integer>, String> map = new HashMap<>();
		
		//Create key which is list
		List<Integer> key1 = new ArrayList<Integer>();
		key1.add(13);
		
		map.put(key1, "Chakri");
		System.out.println(map.get(key1));
		
		key1.add(14);
		
		System.out.println(map.get(key1));

	}

}
