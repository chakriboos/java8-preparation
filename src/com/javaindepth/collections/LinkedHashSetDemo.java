package com.javaindepth.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();

		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");

		System.out.println("Hash set elements : " + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");

		System.out.println("Linked hash set elements : " + linkedHashSet);
	}

}
