package learn.java8;

import java.util.Optional;

public class OptionalFlatMapDemo {
	
	//Write a method to use optional flat map
	//Get bike name of students whose GPA is > 3
	private static void optionalFlatMap() {
		Optional<Student> optStudent = StudentDataBase.getOptionalStudent();
		Optional<String> bikeName = optStudent
				.filter(student -> student.getGpa() > 3)
				.flatMap(Student::getBike)
				.map(Bike::getName);
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
