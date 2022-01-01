package learn.comparable.and.comparator;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		//Sort employees by salary (ascending order)
		return e1.getSalary() - e2.getSalary();
	}
	
	

}
