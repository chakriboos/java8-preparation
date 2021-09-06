package learn.java.sample.code;

public class Sample {

	public static void main(String[] args) {
		//toot
		String s = "racecar";
		
		StringBuilder reverse = new StringBuilder();
		
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			reverse.append(s.charAt(s.length() - j));
		}
		//
//		i 0 j 1 Y
//		i 1 j 2 Y
//		i 2 j 3 Y
//		i 3 j 4
		
		//compare
		if (reverse.toString().equals(s)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
