package java8.listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import java8.comparator.Emp;

public class ListIteratorDemo {

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
		
		ListIterator<Emp> i = empList.listIterator();
		
		while (i.hasNext()) {
			System.out.println(i.next().getEmpId());
		}

		while (i.hasPrevious()) {
			System.out.println(i.previous().getName());
		}
	}

}
