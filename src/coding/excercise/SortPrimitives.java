package coding.excercise;

import java.util.Arrays;

public class SortPrimitives {

	public static void main(String[] args) {
		int[] intArray = {1,15 ,5,2, 90,34,12};
		Arrays.sort(intArray);
		
		System.out.println("Int array after sort : ");
		for (int a : intArray) {
			System.out.print(a +", ");
		}
		System.out.println();
		
		//Sort char array
		char[] charArray = {'a', 'b','A','z','B','N', 'm'};
		Arrays.sort(charArray);
		
		System.out.println("Char array after sort : ");
		for (char c : charArray) {
			System.out.print(c +", ");
		}
		System.out.println();
		
		
		System.out.println("Char array after sort by assigning to int var : ");
		for (int c : charArray) {
			System.out.print(Character.getNumericValue(c) + ":");
			System.out.print(c +", ");
		}
		System.out.println();
		
		//Sort string array
		String[] stringArray = {"man", "none","am"};
		Arrays.sort(stringArray);
		
		for (String s : stringArray) {
			System.out.print(s +", ");
		}
	}

}
