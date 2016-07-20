package java8.exception;

import java.io.FileNotFoundException;

public class Parent1 {
	
	public String methodA1() throws FileNotFoundException, NullPointerException {
		System.out.println("in m1 in p1");
		return "methodA1";
	}

}
