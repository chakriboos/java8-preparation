package learn.java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to demo below stream api methods 1 : distinct 2 : count 3 : sort
 * 
 * @author divyadwarasala
 *
 */
public class StreamOtherMethodsDemo {

	// Create a method to get student activities - distinct
	private static List<String> getStudentActivities() {
		// Get distinct activities
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.collect(Collectors.toList());
	}

	// Create a method to get student activities - count
	private static long getStudentActivitiesCount() {
		// Get count of activities
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.count();
	}

	// Create a method to get student activities - count
	private static List<String> getStudentActivitiesSorted() {
		// Get count of activities
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream).distinct()
				.sorted()
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> distinctActivities = StreamOtherMethodsDemo.getStudentActivities();

		System.out.println("=========== DISTINCT Student activities ===========");
		distinctActivities.forEach((activity) -> System.out.print(activity + ", "));
		System.out.println("=========== DISTINCT Student activities COUNT===========");
		System.out.println(StreamOtherMethodsDemo.getStudentActivitiesCount());
		System.out.println("=========== DISTINCT Student activities SORTED===========");
		
		distinctActivities = StreamOtherMethodsDemo.getStudentActivitiesSorted();
		distinctActivities.forEach((activity) -> System.out.print(activity + ", "));
	}

}
