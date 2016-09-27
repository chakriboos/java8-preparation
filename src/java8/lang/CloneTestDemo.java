package java8.lang;

public class CloneTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CloneTest c1 = new CloneTest();
			c1.a = 10;
			c1.b = 11.234;
			
			CloneTest c2 = c1.cloneObj();
			
			System.out.println(c1.a + " " + c1.b);
			System.out.println(c2.a + " " + c2.b);
			
			c2.a = 99;
			
			System.out.println(c1.a + " " + c1.b);
			System.out.println(c2.a + " " + c2.b);
			
			c1.a = 11;
			
			System.out.println(c1.a + " " + c1.b);
			System.out.println(c2.a + " " + c2.b);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
