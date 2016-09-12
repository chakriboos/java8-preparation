package java8.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		Integer[] array = new Integer[list.size()];
		
		array = list.toArray(array);
		for (int a : array)
		System.out.print(a);
		System.out.println("------------------");
		
Integer[] array1 = new Integer[list.size() - 1];
		
		array1 = list.toArray(array1);
		for (int a : array1)
			System.out.print(a);
		System.out.println("------------------");
		
Integer[] array2 = new Integer[list.size() + 1];
		
		array2 = list.toArray(array2);
		for (int a : array2)
			System.out.print(a);
		
	}

}
