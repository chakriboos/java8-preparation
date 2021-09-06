package learn.java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Method to demo flatMap method in stream api
 * @author divyadwarasala
 *
 */
public class StreamsFlatMapMethodDemo {
	
	//Get student activities
	private static List<String> getStudentActivities() {
		List<String> studentActivitiesList = StudentDataBase.getAllStudents().stream()
			.map(Student::getActivities) //Stream<List<String>>
			.flatMap(List::stream)
			.collect(Collectors.toList());
		
		return studentActivitiesList;
		
	}
	
	public static void main(String[] args) {
		List<String> studentActivitiesList =  StreamsFlatMapMethodDemo.getStudentActivities();
		
		System.out.println("=========== Student activities ===========");
		for (String activity : studentActivitiesList) {
			System.out.print(activity + ", ");
		}
	}

}
