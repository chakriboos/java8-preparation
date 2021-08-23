package java8.lambdas;

public class Add2NumbersImpl {
	
	public static void main(String args[]) {
		Add2Numbers impl1 = (a, b) -> System.out.println("Sum : " + (a + b));
		impl1.add(20, 30);
	}
}
