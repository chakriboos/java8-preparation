package java8.lambdas.methodref;

public class StringRev {
	
	static String reverseString(String str) {
		String revStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
}
