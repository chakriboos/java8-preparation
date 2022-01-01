
public class CheckPalindrome {

	public static void main(String[] args) {

//			String[] inputArray = {"cars", "nun"};
			
			/*for (String input : inputArray) {
				//Check palindrome
				for 
			}*/
			
			//Check palindrome for one string value
			String input = "racecar";
			
			int inputLength = input.length();
			
			StringBuilder reverse = new StringBuilder();
			
			for (int i = inputLength - 1; i >= 0; i-- ) {
				reverse.append(input.charAt(i));
			}
			
			if (input.equals(reverse.toString())) {
				System.out.println("INPUT " + input + " is palindrome");
			} else {
				System.out.println("INPUT " + input + " NOT palindrome");
			}
 	}

}
