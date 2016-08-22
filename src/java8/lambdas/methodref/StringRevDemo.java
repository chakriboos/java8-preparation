package java8.lambdas.methodref;

public class StringRevDemo {

	static String stringOp(StringOper obj, String str) {
		return obj.striongOps(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr =  "Lambda add power"; 
		String output = stringOp(StringRev::reverseString, "asfsdzf ");
		System.out.println(output);
	}

}
