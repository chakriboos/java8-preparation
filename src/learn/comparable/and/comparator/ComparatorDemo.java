package learn.comparable.and.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", "Doe", 22, 12000);
		Employee e2 = new Employee("John", "Mary", 33, 1000);
		Employee e3 = new Employee("Check", "Red", 13, 120000);
		Employee e4 = new Employee("Mary", "End", 202, 5678);
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Collections.sort(empList, new EmpComparator());
		
		System.out.println(empList);
	}

}
