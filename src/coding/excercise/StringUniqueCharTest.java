package coding.excercise;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharTest {

	public static void main(String[] args) {
		//input is s1
		//Take one char
		//Add to hash set
		//If all char added then unique
		//If not one or more char repeated
		
		String s1 = "samplee";
		
		boolean uniqueChar = true;
		
		Set<Character> charSet = new HashSet<Character>();
		
		for (int i = 0; i <= s1.length() - 1; i++) {
			if (!charSet.add(s1.charAt(i))) {
				System.out.println("Char : " + s1.charAt(i));
				uniqueChar = false;
			}
		}
		
		//charSet.stream().forEach((oneChar) -> System.out.println(oneChar));
		//System.out.println("Char set : " + uniqueChar);
		
		System.out.println("UNIQUE CHAR : " + uniqueChar);
	}

}
