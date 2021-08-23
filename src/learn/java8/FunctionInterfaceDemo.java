package learn.java8;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	
	//Calculate length of the string
	static Function<String, String> calLength = (string) -> string.substring(4); 
	
	//Convert string to upper case
	static Function<String, String> converToUpperCase = (string) -> string.toUpperCase();
	
	public static void main(String[] args) {
		System.out.println(calLength.apply("java is great"));
		
		System.out.println(converToUpperCase.apply("java is great"));
		
		//Chain functions
		System.out.println(calLength.andThen(converToUpperCase).apply("java is great"));
	}	

}
