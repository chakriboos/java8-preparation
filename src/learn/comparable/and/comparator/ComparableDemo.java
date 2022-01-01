package learn.comparable.and.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		EmployeeWithComparable e1 = new EmployeeWithComparable("chek", "Dwar", 1);
		EmployeeWithComparable e2 = new EmployeeWithComparable("Man", "Red", 19);
		EmployeeWithComparable e3 = new EmployeeWithComparable("John", "Doe", 22);
		EmployeeWithComparable e4 = new EmployeeWithComparable("John", "End", 5);
		
		List<EmployeeWithComparable> empList = new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Collections.sort(empList);
		
		System.out.println(empList);
	}

}
