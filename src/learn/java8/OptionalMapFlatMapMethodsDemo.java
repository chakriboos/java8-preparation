package learn.java8;

import java.util.Optional;
import java.util.function.Function;

public class OptionalMapFlatMapMethodsDemo {
	
	//Method which use optional filter method
	public static void optionalFilter() {
		Optional<Student> studentOptional
			= Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		studentOptional
			.filter((studentObject) -> studentObject.getGpa() > 4.9)
			.ifPresent(studentObject -> System.out.println("Inside optionalFilter Method : " + studentObject.getName()));
		
	}
	
	//Method which use optional map method
	public static void optionalMap() {
		Optional<Student> studentOptional
			= Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<String> studentName = studentOptional
			.filter((studentObject) -> studentObject.getGpa() > 4.9)
			//.map( student -> student.getName());
			.map(Student::getName);
		//.map( student -> student.getName());
		
		System.out.println("Student name inside optionalMap method : " + studentName);
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
	}

}
