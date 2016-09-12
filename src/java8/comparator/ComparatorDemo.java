package java8.comparator;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}
