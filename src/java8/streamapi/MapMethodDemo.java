package java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> dList = new ArrayList<Double>();
		dList.add(16.0);
		dList.add(9.0);
		
		Stream<Double> d = dList.stream().map((a) -> Math.sqrt(a));
		System.out.println(d.reduce((a, b) -> (a * b)));
	}

}
