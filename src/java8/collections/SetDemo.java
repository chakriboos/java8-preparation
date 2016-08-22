package java8.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		System.out.println(set.add("one"));
		System.out.println(set.add(null));
		System.out.println(set.add("two"));
		System.out.println(set.add("one"));
		System.out.println(set.add(null));
		System.out.println(set.add("two"));
		
		
		for (String str : set)
			System.out.println(str);
		
		Set<Integer> intSet = new HashSet<>();
		
		System.out.println(intSet.add(10));
		System.out.println(intSet.add(null));
		System.out.println(intSet.add(11));
		System.out.println(intSet.add(10));
		System.out.println(intSet.add(null));
		System.out.println(intSet.add(11));
		
		for (Integer str : intSet)
			System.out.println(str);
	}

}
