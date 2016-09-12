package java8.files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c;
		String src = "if (a == 4) the a = 4;\n";
		ByteArrayInputStream stream = new ByteArrayInputStream(src.getBytes());
		
		try(PushbackInputStream pStream = new PushbackInputStream(stream)) {
			while((c = pStream.read()) != -1) {
				switch(c) {
				case '=':
					
				}
			}
		}
	}

}
