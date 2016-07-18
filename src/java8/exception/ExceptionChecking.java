package java8.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionChecking {

	public static void main(String[] args) {
		try {
			int a = 10/0;
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}

}
