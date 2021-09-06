package learn.java8;

import java.util.function.Consumer;

public class LambdaVarRestrictions {
	
	int number = 2;
	
	public static void main(String[] args) {
		int i =0;
		
		Consumer<String> consumer = (in) -> {
			
			System.out.println("Hi " + i);
		};
		
		consumer.accept("Java 8");
	}
	
	public void display() {
		Consumer<Integer> consumer = (number) -> {
			System.out.println("VALUE : " + number++);
		};
	}

}
