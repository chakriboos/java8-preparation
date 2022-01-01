package coding.excercise;

public class PalindromeUsingStrings {

	public static void main(String[] args) {
		String input = "mama";
		
		StringBuilder reverse = new StringBuilder();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse.append(input.charAt(i));
		}
		
		if (reverse.toString().equals(input)) {
			System.out.println("Given string :" + input + ": is palindrome");
		} else {
			System.out.println("Given string :" + input + ": is NOT palindrome");
		}
	}

}
