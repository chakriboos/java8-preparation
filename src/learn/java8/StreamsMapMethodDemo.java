package learn.java8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Want to see how to call streams api map method 
 * @author divyadwarasala
 *
 */
public class StreamsMapMethodDemo {
	
	//Write a method to call map method which returns student names
	public static List<String> getStudentNames() {
		List<String> studentNamesList = StudentDataBase.getAllStudents().stream()
		.map((student) -> student.getName())
		.collect(Collectors.toList());
		
		return studentNamesList;
	}
	
	//Write a method to call map method which returns student names as SET
	public static Set<String> getStudentNamesAsSet() {
		Set<String> studentNamesSet = StudentDataBase.getAllStudents().stream()
		.map((student) -> student.getName())
		.collect(Collectors.toSet());
		
		return studentNamesSet;
	}
	
	public static void main(String[] args) {
		List<String> studentNamesList = StreamsMapMethodDemo.getStudentNames();
		
		//Sort student names in ascending order
		Collections.sort(studentNamesList);
		
		System.out.println("=====Print student names =========");
		for (String studentName : studentNamesList) {
			System.out.print(studentName + ", ");
		}
		
		System.out.println("\n=====Filter names starting with J=====");
		
		//Print names staring with J
		studentNamesList.stream().filter((name) -> name.startsWith("J"))
			.forEach((name) -> System.out.print(name + ", "));
		
		//Get student names as set
		Set<String> studentNamesSet = StreamsMapMethodDemo.getStudentNamesAsSet();
		
		System.out.println("\n=====Print student names from SET=========");
		
		for (String name : studentNamesSet) {
			System.out.print(name + ", ");
		}

	}

}
