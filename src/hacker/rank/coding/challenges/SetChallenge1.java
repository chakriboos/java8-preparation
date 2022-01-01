package hacker.rank.coding.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetChallenge1 {

	public static void main(String[] args) {
		/**
		 * 
		 * Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3
		 */
		
		//Read number of inputs
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int noOfRows = Integer.parseInt(scanner.nextLine());
		String[] inputs = new String[noOfRows];
		System.out.println("Enter input");
		for ( int i = 0; i < noOfRows; i++) {
			//Read input
			inputs[i] = scanner.nextLine();
		}
		
		//Find unique pairs
		Set<String> inputAsSet = new HashSet<String>();
		
		int uniqueInputs = 0;
		for (String input : inputs) {
			if (inputAsSet.add(input)) {
				System.out.println(++uniqueInputs);
			} else {
				System.out.println(uniqueInputs);
			}
		}
		
		scanner.close();

	}

}
