package java8.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String str2 = null;
		
		list.add(0, str2);
		list.add("first");
		list.add(null);
		System.out.println(list.add(null));
		list.add("last");
		System.out.println(list.add("last"));
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("---------------");
		
		Set<String> set = new HashSet<>();
		
		set.add("first");
		set.add(null);
		System.out.println(set.add(null));
		set.add("last");
		
		for (String str : set) {
			System.out.println(str);
		}
		
		// TODO Auto-generated method stub
		/*List<EmpDetails> list = new ArrayList<EmpDetails>();
		
		list.add(new EmpDetails());
		//list.add(new String());
		String str = new String("abcd");
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println(sb.reverse());*/
	}

}
