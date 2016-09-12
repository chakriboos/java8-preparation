package java8.files;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamResetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "abc";
		ByteArrayInputStream stream = new ByteArrayInputStream(src.getBytes());
		
		for (int i = 0; i< 2; i++) {
			int c;
			while ((c = stream.read()) != -1 ) {
				if (i == 0)
					System.out.print((char)c);
				if (i == 1)
					System.out.println(Character.toUpperCase((char)c));
			}
			stream.reset();
		}
	}

}
