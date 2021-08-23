package com.java.FP;

import java.util.List;

public class FirstFunctionalProgram {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 5, 4, 1, 3);
		
		printList(list);
		

	}

	private static void printList(List<Integer> list) {
		//Print using streams
		list.stream().forEach(FirstFunctionalProgram::printAnElement);
		
	}
	
	private static void printAnElement(Integer number) {
		//Print using streams
		System.out.println(number);
		
	}
	
	

}
