package java8.lambdas;

public class MyNum2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "111";
		String two = "2222";
		MyNum2 obj;
		obj = (a, b) -> a + b;
		System.out.println(obj.getMsg(one, two));
	}

}
