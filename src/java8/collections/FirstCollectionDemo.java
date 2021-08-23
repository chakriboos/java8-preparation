package java8.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstCollectionDemo {

	public static void main(String[] args) {

		// Create a list and add elements
		List<String> list = new ArrayList<>();

		list.add("First");
		list.add("first");
		list.add("Second");
		list.add("Third");
		list.add("first");

		/*
		 * System.out.println(list.stream().filter((listElement) -> { boolean
		 * startsWithF = false; if (listElement.startsWith("f")) { return true; } return
		 * startsWithF; }));
		 */

		System.out.println("Original List output : " + list);
		System.out.println("Filtered List output : "
				+ list.stream().filter(listElement -> listElement.startsWith("f")).collect(Collectors.toList()));

		// Create set and add duplicates
		Set<String> set = new HashSet<>();

		set.add("First");
		set.add("first");
		set.add("Second");
		set.add("Third");
		set.add("first");
		set.add("first");
		set.add("first");
		set.add("first");

		System.out.println("Set output : " + set);

		// Create ordered set and add duplicates
		Set<String> orderedSet = new LinkedHashSet<>();

		orderedSet.add("First");
		orderedSet.add("first");
		orderedSet.add("Second");
		orderedSet.add("Third");
		orderedSet.add("first");
		orderedSet.add("first");

		System.out.println("Set output : " + orderedSet);

	}

}
