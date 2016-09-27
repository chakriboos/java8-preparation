package java8.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SubMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("1", "one");
		map.put("3", "three");
		map.put("7", "seven");
		map.put("4", "four");
		
		Map<String, String> subMap = map.headMap("7");
		
		Set<Map.Entry<String, String>> set = subMap.entrySet();
		
		for (Map.Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		subMap.put("4", "fourmodified");
		
Set<Map.Entry<String, String>> mapSet = map.entrySet();
		
		for (Map.Entry<String, String> entry : mapSet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
	}

}
