package java8.files;

import java.io.File;

public class DirDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("/java");
		if (dir.isDirectory()) {
			String list[] = dir.list();
			for(int i = 0; i< list.length; i++) {
				File f = new File("/java/" + list[i]);
				System.out.println("name:" + f.getName() + " is dir:"+ f.isDirectory());
			}
		}
	}

}
