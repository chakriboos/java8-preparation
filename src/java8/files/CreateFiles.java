package java8.files;

import java.io.File;

public class CreateFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("\\");
		File f2 = new File("/", "test2.bat");
		File f3 = new File(f1, "test3.bat");
	}

}
