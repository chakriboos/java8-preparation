package java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(50);
		list.add(5);
		list.add(12);
		list.add(6);
		
		Optional<Integer> multi = list.stream().reduce((a, b) -> a*b );
		System.out.println("multiplication:"+multi);
		Integer multiply = list.stream().reduce(1, (a, b) -> a*b );
		System.out.println("multiplication2:"+multiply);
	}

}
