package java8.spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

import com.sun.scenario.animation.SplineInterpolator;

import java8.comparator.Emp;

public class SplIteratorDemo {

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
		
		final int empId1 = 0;
		
		Spliterator<Emp> splIte = empList.spliterator();
		
		while(splIte.tryAdvance((n) -> System.out.println(n.getEmpId())));
		
		splIte.forEachRemaining((n) -> {		
		String empName = n.getName();
		System.out.println(empName);
		
			});
		
		List<Integer> list = new ArrayList<>();
		
		splIte = empList.spliterator();
		
		while(splIte.tryAdvance((n) -> list.add(n.getEmpId() + n.getEmpId())));
		
		for(Integer i  : list) {
			System.out.println(i);
		}
		
		
		
	}

}
