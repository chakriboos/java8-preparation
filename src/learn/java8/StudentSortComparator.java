package learn.java8;

import java.util.Comparator;

public class StudentSortComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getGradeLevel() - o2.getGradeLevel();
	}

}
