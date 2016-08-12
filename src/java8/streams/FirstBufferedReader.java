package java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("q to quit");
		char ch;
		do {
			ch = (char) br.read();
			System.out.println(ch);
		} while(ch != 'q');
		
	}

}
