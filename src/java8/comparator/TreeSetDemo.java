package java8.comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> family = new TreeMap<>((a , b) -> a.compareTo(b));
		
		family.put("chak ba", 28);
		family.put("may amc", 2);
		family.put("div vel", 29);
		
		for (Map.Entry<String, Integer> entry : family.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}

}
