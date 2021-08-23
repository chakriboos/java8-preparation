package com.javaindepth.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstMapDemo {

	public static void main(String[] args) {
		// Create a map add entries
		Map<String, Integer> personDetailsMap = new HashMap<>();

		personDetailsMap.put("Chakri", 35);
		personDetailsMap.put("Mayank", 8);
		personDetailsMap.put("Mayanshi", 4);
		personDetailsMap.put("Divya", 35);
		personDetailsMap.put("Noname", 0);

		System.out.println("Unmodified map : " + personDetailsMap);

		// Iterate the map
		Set<String> personDetailsMapKeySet = personDetailsMap.keySet();

		for (String key : personDetailsMapKeySet) {
			System.out.println("Key : " + key);
		}

		// Print each element of personDetailsMap
		Set<Map.Entry<String, Integer>> entrySet = personDetailsMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println("KEY : " + entry.getKey() + " VALUE : " + entry.getValue());
		}

		// Create a map which stores object as values
		Map<String, Object> objectMap = new HashMap<>();
		objectMap.put("One", new Object());
		objectMap.put("two", new Object());
		objectMap.put("THREE", new Object());

		System.out.println(objectMap);

	}

}
