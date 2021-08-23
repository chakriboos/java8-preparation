package learn.java8;

import java.util.Optional;

public class OptionalDemo1 {
	
	public static void main(String[] args) {
		
		Optional<Student> optionalString = Optional.ofNullable(null);//StudentDataBase.studentSupplier.get());
		
		System.out.println("Inside MAIN method");
		
		if (optionalString.isPresent()) {
			optionalString.get();
		} else {
			optionalString = Optional.empty();
		}
		
		optionalString.get();
	}
	
}
