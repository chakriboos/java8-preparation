package learn.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		//Create predicate 
		Predicate<String> predicate = (value) -> value.equals("java");
		
		Predicate<String> predicateJava8 = (value) -> value.equals("java8");
		
		//Create consumer 
		Consumer<String> consumer = (value) -> System.out.println("Value is : " + value);
		
		//Create predicate with consumer 
		Predicate<String> predicateWithConsumer = (value) -> {
			consumer.accept(value);
			if (value.equals("consumer") || value.equals("consumer8")) {
				return true;
			}
			return false;
			
		};
		
		//Call predicate with consumer
		System.out.println("P with C result : " + predicateWithConsumer.test("CONSUMER".toLowerCase()));
		
		//Call predicate
		//System.out.println("JAVA : " + predicate.test("java"));
		
		//System.out.println("JAVA8 : " + predicateJava8.test("java8"));
		
		//Chain predicate
		//System.out.println(predicate.and(predicateJava8).negate().test("java"));
		
	}

}
