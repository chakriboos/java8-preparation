package java8.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ImplementationA implements InterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationA a = new ImplementationA();
		a.sayHello();
		a.sayHelloWithName("xyz");
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("in sayHello method implemetation");
	}

	@Override
	public String sayHelloWithName(String name) {
		// TODO Auto-generated method stub
		System.out.println("in sayHello method implemetation::::" + name);
		return name;
	}

}
