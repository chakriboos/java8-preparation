package learn.java8;

import java.util.function.Consumer;

public class LambdaVariableDemo {

	static int i = 0;
			
	public static void main(String[] args) {
		
		
		
		Consumer<Integer> consumer = (i2) -> {
			System.out.println("HI");
			i++;
			System.out.println(i);
		};
		
		consumer.accept(4);

	}

}
