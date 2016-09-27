package java8.wrappers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseInt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		do {
			String str = br.readLine();
			i = Integer.parseInt(str);
			System.out.println("entered number is " + i);
		 } while (i != 0);
		
	}

}
