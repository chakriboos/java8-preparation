package java8.files;

import java.io.File;

public class FileDemo {
	
	static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/java/copyright.txt");
		print("name : " + file.getName());
		print("exists: " + file.exists());
		print("abs path: " + file.getAbsolutePath());
	}

}
