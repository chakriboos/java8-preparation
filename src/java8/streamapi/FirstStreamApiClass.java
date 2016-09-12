package java8.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FirstStreamApiClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(512);
		list.add(50);
		list.add(5);
		list.add(12);
		list.add(516);
		
		System.out.println("List:" + list);
		
		Stream<Integer> stream = list.stream();
		
		Optional<Integer> inte = stream.min(Integer::compare);

		if(inte.isPresent())
		System.out.println("min val:"+inte.get());
		
		stream = list.stream();
		Optional<Integer> integ = stream.max(Integer::compare);
		if(integ.isPresent())
			System.out.println("max val:" + integ.get());
		
		Stream<Integer> streamSorted = list.stream().sorted();
		streamSorted.forEach((n) -> System.out.println(n));
		
		Stream<Integer> oddStream = list.stream().filter((n) -> (n % 2) == 1);
		oddStream.forEach((n) -> System.out.println(n));
		
	}

}
