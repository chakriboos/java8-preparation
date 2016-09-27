package java8.comparator;

import java.util.Comparator;

public class LastNameComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int i = o1.lastIndexOf(' ');
		int j = o2.lastIndexOf(' ');
		
		int k = o1.substring(i).compareTo(o2.substring(j));
		
		if (k == 0) {
			return o1.compareToIgnoreCase(o2); 
		} else {
			return k;
		}
	}
	
	
}
