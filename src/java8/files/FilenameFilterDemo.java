package java8.files;

import java.io.File;

public class FilenameFilterDemo {

	public static void main(String[] args) {
		Filter filter = new Filter(".bmp");
		File dir = new File("/java");
		String[] list = dir.list(filter);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list.length);
		}

	}

}
