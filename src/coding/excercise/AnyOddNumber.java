package coding.excercise;

import java.util.Arrays;
import java.util.List;

public class AnyOddNumber {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 5,7,3);
		
		boolean isEvenNumberPresent = numberList.stream().anyMatch(number -> number%2 ==0);
		
		System.out.println("All are Odd numbers : " + !isEvenNumberPresent);
	}

}
