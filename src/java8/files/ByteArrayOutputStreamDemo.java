package java8.files;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		String str = "This is a string";
		try {
			out.write(str.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("content:" + out.toString());
		
		
	}

}
