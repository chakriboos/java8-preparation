package learn.java8;

import java.util.Optional;

public class OptionalNullableDemo {

	public static void main(String[] args) {
		Optional<String> employeeMiddleName = Optional.ofNullable(null);
		
		if (employeeMiddleName.isPresent()) {
			System.out.println("Middle name  : " + employeeMiddleName.get());
					 
		} else {
			System.out.println("Middle name  : " + null);
		}
		
	}

}
