package java8.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		try(FileInputStream fis = new FileInputStream("/java/FileInputStreamDemo.java")) {
			System.out.println("available bytes : " + fis.available());
			size = fis.available()/40;
			for (int i = 0; i < size; i++) {
				System.out.print((char)fis.read());
			}
			System.out.println("still available bytes : " + fis.available());
			fis.skip(10);
			System.out.println("still available bytes after skip: " + fis.available());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
