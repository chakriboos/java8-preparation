package learn.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortComparatorImpl {

	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		//Collections.sort(studentList, StudentSortComparator.class);
		
		//System.out.println(studentList);
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
            public int compare(Student o1, Student o2) {
                return (o1.getGradeLevel() - o2.getGradeLevel()) * (-1);
            }
		});
		
		System.out.println(studentList);

	}

}
