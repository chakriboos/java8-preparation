package java8.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		boolean oneAdded = set.add("one");
		System.out.println(set + " Added : " + oneAdded);
		
		boolean twoAdded = set.add("one");
		System.out.println(set + " Added : " + twoAdded);
		
		
		

	}

}
