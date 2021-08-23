package learn.java8;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer1 = (a, b) -> {
			System.out.println("a1 : " + a + " b1 : " + b);
		};
		
		BiConsumer<String, String> biConsumer2 = (a, b) -> {
			System.out.println("a2 : " + a + " b2 : " + b);
		};
		
//		biConsumer1.accept("1First", "1Second");
//		biConsumer2.accept("2First", "2Second");
		biConsumer1.andThen(biConsumer2).accept("11", "12");
		
		//Create list 
		List<String> l = List.of("one", "two", "three", "one");
		//Verify for each method
		l.forEach((man) -> biConsumer1.accept(man, man));
		
		Predicate<String> predicate = (String) -> false;
		
		System.out.println("PREDICATE result : " + predicate.test("shjfgck"));
		
		
		
		
	}

}
