package learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {

		System.out.println(IntStream.rangeClosed(0, 100).sum());

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 8, 8, 8, 7, 7, 9);
		
		List<Integer> intList2 = List.of(1,2,3,4,4,45,5,5);
		
		System.out.println(intList.stream().distinct().collect(Collectors.toList()));
		
		System.out.println(intList2.stream().distinct().collect(Collectors.toList()));
		
		//write compareto method and understand return values
		System.out.println("a".compareTo("A"));
		System.out.println("a".compareTo("a"));
		System.out.println("A".compareTo("a"));
		System.out.println(Integer.toHexString('a'));
		System.out.println(Integer.toHexString('A'));

	}

}
