package java8.interfaces;

public interface AlphaChild extends Alpha {
	default void print() {
		Alpha.super.print();
		System.out.println("AlphaChildprint method");
	}
}
