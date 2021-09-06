package learn.java8;

import java.util.Optional;

public class OptionalDemo2 {
	
	//Write method to get a student
	private static String getStudentName() {
		
		Student student = StudentDataBase.studentSupplier.get();// getOptionalStudent();
		
		if (student != null) {
			return student.getName();
		}
		
		return null;
	}
	
	//Write method to get a student with optional
	private static Optional<String> getStudentNameOptional() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		if (studentOptional.isPresent()) {
			//Return student name as optional string
//			Optional<String> studentNameOptional = studentOptional.get();
			return studentOptional.map(Student::getName);
		}
		
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		//Print student name
		String name = getStudentName();
		
		System.out.println("Student name length : " + name.length());
	}

}
