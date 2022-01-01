package java8.collections;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		String s = "ajhgdf";
		
		String emptyString = "";
		
		Employee emp1 = new Employee("chek", "Dwa", 1);
		
		System.out.println(s.hashCode());
		System.out.println(emptyString.hashCode());
		System.out.println(emp1.hashCode());
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put(null, "one");
		String oldVal = map.put(null, "two");
		
		System.out.println(oldVal);
		
		map.forEach((k, v) -> {System.out.println("K : " + k + " V : " + v);});
		
	}

}
