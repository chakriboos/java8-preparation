package coding.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MaxNumInArray {

	public static void main(String[] args) {
		//Integer[] numArray = {-31, -3, -4, -99, -32}; //{1, 55, 3, 99, 54, 76, 21};
		
		int[] numArray = {-2147483648, -21648};//{5, 3, 4, 99,76, 234};
		
		//Add primitive int to list
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i =0; i < numArray.length; i++) {
			intList.add(numArray[i]);
		}
		
		//Find max num in array
		//List<Integer> intList = Arrays.asList(numArray);
		
		int maxNum = Collections.max(intList);
		
		System.out.println("Max number by using built in method : " + maxNum);
		
		maxNum = intList.isEmpty() ? 0 : intList.get(0);
		
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) > maxNum) 
				maxNum = intList.get(i);
		}
		
		System.out.println("Max number by using custom method : " + maxNum);
	}

}
