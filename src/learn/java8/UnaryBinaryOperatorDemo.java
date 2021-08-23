package learn.java8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorDemo {
	
	static UnaryOperator<String> u = (value) -> value.substring(1); 
	
	static BinaryOperator<String> b = (value1, value2) -> value1.concat(value2);
	
	public static void main(String[] args) {
		
		System.out.println(u.apply("Price"));
		
		System.out.println(b.apply("java ", "great"));

	}

}
