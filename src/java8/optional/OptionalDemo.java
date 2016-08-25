package java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> noVal = Optional.empty();
		Optional<String> withVal = Optional.of("ABCDEFGHIJK");
		if (noVal.isPresent()) {
			System.out.println("NO VAL IS THERE");
		} else {
			System.out.println("NO VAL");
		}
	}

}
