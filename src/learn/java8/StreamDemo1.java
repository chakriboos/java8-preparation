package learn.java8;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		//Get student's list
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		//Create a predicate to filter by grade
		Predicate<Student> filterByGPA = (student) -> { 
			System.out.println("inside filterByGPA predicate");
			return (student.getGpa() > 3.9);
		}; 
		
		//Call stream on student's list
		Map<String, List<String>> studentsWithMoreGPA =  studentList.stream()
			.filter(filterByGPA).collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentsWithMoreGPA);
		
//		studentList.stream().filter(filterByGPA);
		
	}

}
