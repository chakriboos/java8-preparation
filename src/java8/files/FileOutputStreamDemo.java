package java8.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "its time for all good men to \n" + 
						"come back and pay \n" + "taxes";
		byte[] buf = source.getBytes();
		FileOutputStream f1 = null;
		FileOutputStream f2 = null;
		FileOutputStream f3 = null;
		
		try {
			f1 = new FileOutputStream("/file1.txt");
			f2 = new FileOutputStream("/file2.txt");
			f3 = new FileOutputStream("/file3.txt");
			
			for (int i = 0; i < buf.length; i += 2) {
				f1.write(buf[i]);
			}
			
			f2.write(buf, buf.length - buf.length/4, buf.length/4);
			
			f3.write(buf);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (f1 != null) {
				try {
					f1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

			if (f2 != null) {
				try {
					f2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			

			if (f3 != null) {
				try {
					f3.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	}

}
