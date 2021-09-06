package learn.java8;

public class StudentSort implements Comparable<Student> {

	@Override
	public int compareTo(Student student) {
		return student.getGradeLevel();
	}

}
