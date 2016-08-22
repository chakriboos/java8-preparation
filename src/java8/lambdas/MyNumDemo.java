package java8.lambdas;

public class MyNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNum obj;
		obj = () -> 123.45;
		System.out.println(obj.getVal());
		
		obj = () -> Math.random() * 100;
		System.out.println(obj.getVal());
		
		obj = () -> 'a';
		System.out.println(obj.getVal());
	}

}
