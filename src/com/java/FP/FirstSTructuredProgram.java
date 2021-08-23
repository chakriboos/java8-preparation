package com.java.FP;

import java.util.List;

public class FirstSTructuredProgram {

	public static void main(String[] args) {
		//Create a list
		List<Integer> list = List.of(1, 2, 5, 4, 1, 3);
		printList(list);

	}

	//Create method to print list
	private static void printList(List<Integer> list) {
		// Iterate list
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}
	
	
	

}
