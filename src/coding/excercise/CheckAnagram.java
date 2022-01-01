package coding.excercise;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CheckAnagram {

	public static void main(String[] args) {
		String input1 = "ckv";
		String input2 = "racjsdghfk";
		
		char[] input1Array = input1.toLowerCase().toCharArray();
		Arrays.sort(input1Array);
		
		char[] input2Array = input2.toLowerCase().toCharArray();
		Arrays.sort(input2Array);
		System.out.println("START : " + new Date().getTime());
		if ((input1.length() == input2.length()) 
				&& String.valueOf(input1Array).equals(String.valueOf(input2Array))) {
			System.out.println("They are Anagram");
		} else {
			System.out.println("They are NOT Anagram");
		}
		System.out.println("START : " + new Date().getTime());
		
	}

}
