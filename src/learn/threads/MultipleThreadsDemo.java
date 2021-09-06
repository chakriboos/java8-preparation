package learn.threads;

import java.io.IOException;

public class MultipleThreadsDemo {

	public static void main(String[] args) throws IOException {
		
		String srcFile1 = "a.txt";
		String srcFile2 = "b.txt";
		
		String destFile1 = "c.txt";
		String destFile2 = "d.txt";
		
		FileCopyUtil.copyFile(srcFile1, destFile1);
		FileCopyUtil.copyFile(srcFile2, destFile2);
		
		System.out.println("DONE");
		
	}

}
