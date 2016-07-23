package java8.inheritance;

public class B extends A {
	B() {
		super(9);
		System.out.println("in 0 param constructor");
		int a = 2;
		Object abc = new int[9];
		a *= 5;
	}
}
