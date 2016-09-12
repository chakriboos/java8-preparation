package java8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<>();
		
		set.add("one");
		set.add("ten");
		set.add("four");
		
		set.add("six");
		set.add("three");
		
		System.out.println(set);
	}

}
