package java8.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetCodeChallenge {

	public static void main(String[] args) {
		//Read from console
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
		//print unique strings count
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < t; i++) {
        	set.add(pair_left[i] + " " + pair_right[i]);
        	/*if (i == 0) {
        		set.add(pair_left[i] + " " + pair_right[i]);
        	} else {
        		
        	}*/
        	System.out.println(set.size());
        }
	}

}
