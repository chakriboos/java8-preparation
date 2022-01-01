package coding.excercise;

public class ReverseString {

	public static void main(String[] args) {
		String original = "car";
		
		StringBuilder reverse = new StringBuilder();
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse.append(original.charAt(i));
		}
		
		System.out.println("Reverse Manually : " + reverse);
		
		System.out.println("Reverse Built in method : " + new StringBuilder(original).reverse());
	}

}
