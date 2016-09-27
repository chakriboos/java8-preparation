package java8.lang;

import java.io.IOException;

public class ProcessBuilderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("notepad.exe", "pbDemo");
		pb.start();
	}

}
