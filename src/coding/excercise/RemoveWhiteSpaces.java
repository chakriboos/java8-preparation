package coding.excercise;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String input = "i am now ";
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char oneChar : charArray) {
			if (!Character.isWhitespace(oneChar)) {
				output.append(oneChar);
			}
		}
		
		System.out.println("After removing white spaces : " + output);
		
		String inputForStrip = " what is next ";
		System.out.println("After strip :" + inputForStrip.strip() + ":");
		
	}

}
