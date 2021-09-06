package learn.threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyUtil {
	
	public static void copy(InputStream src, OutputStream dest) throws IOException {
		int value;
		while ((value = src.read()) != -1) {
			dest.write(value);
		}
	}
	
	public static void copyFile(String src, String dest) throws IOException {
		
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		
		copy(in, out);
		
		in.close();
		out.close();
	}
}
