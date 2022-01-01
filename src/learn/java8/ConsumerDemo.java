package learn.java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		
		Consumer<String> consumer2 = (System.out::print);
		
		consumer.accept("mayank");
	}

}
