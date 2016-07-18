package java8.exception;

import java.io.IOException;

public class Child1 extends Parent1 {
	
	public String methodA1() {
		System.out.println("in m1 in c1");
		return "methodA1C1";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child1 = new Child1();
		child1.methodA1();

	}

}
