package java8.exception;

import java.io.FileNotFoundException;

public interface InterfaceA {
	
	public void sayHello() throws FileNotFoundException, ArrayIndexOutOfBoundsException;
	
	public String sayHelloWithName(String name) throws Throwable; 

}
