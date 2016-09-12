package java8.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Emp> empList = new ArrayList<Emp>();
			Emp e1 = new Emp("one", 1);
			Emp e2 = new Emp("four", 4);
			Emp e3 = new Emp("nine", 9);
			Emp e4 = new Emp("three", 3);
			empList.add(e1);
			empList.add(e2);
			empList.add(e3);
			empList.add(e4);
			
			Collections.sort(empList, new ComparatorDemo());
			
			for (Emp emp : empList) {
				System.out.println(emp.getEmpId() + " : " + emp.getName());
			}
	}

}
