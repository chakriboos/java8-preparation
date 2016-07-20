package java8.innerclass;

public class Outer {
	int x =10;
	
	class Inner {
		int y = 20;
		int x = 10;
	}
	void printY() {
		System.out.println(x);
	}
}
