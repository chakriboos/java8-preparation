package learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceDefaultMethodImpl {

	public static void main(String[] args) {

		List<String> list = List.of("Ana", "Mike", "Bob", "Aran");
		
		List<String> list2 = Arrays.asList("Ana", "Mike", "Bob", "Aran");
		
		
//		Collections.sort(list2);
		list2.sort(Comparator.naturalOrder());
		
		System.out.println(list2);
	}

}
