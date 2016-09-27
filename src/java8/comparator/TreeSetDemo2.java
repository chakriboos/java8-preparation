package java8.comparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> family = new TreeMap<>(new LastNameComparator());
		
		family.put("chak ba", 28);
		family.put("may amc", 2);
		family.put("CHAk ba", 32);
		family.put("may AMc", 1);
		family.put("div vel", 29);
		family.put("di vel", 29);
		family.put("aaa uel", 29);
		
		System.out.println(family.size());
		
		for (Map.Entry<String, Integer> entry : family.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
