package java8.lang;

import java.io.IOException;

public class ExecDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("notepad");
		p.waitFor();
		System.out.println("notepad opened");
	}

}
