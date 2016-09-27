package java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(-5);
		list.add(5);
		list.add(-35);
		list.add(-53);
		list.add(75);
		
		Collections.sort(list);
		
		for (int i : list) {
			System.out.println(i);
		}
		
		Collections.shuffle(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
	}

}

