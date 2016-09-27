package java8.lang;

public class ShallowCloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ShallowClone s1 = new ShallowClone();
			int x[] = {77, 78};
			s1.a = x;
			//System.arraycopy(x, 0, s1.a, 0, 2);
			s1.d = 11.23;
			
			ShallowClone s2 = (ShallowClone) s1.clone();
			System.out.println(s1.a[0] + ":" +s1.a[1] + ":"+ s1.d);
			System.out.println(s2.a[0] + ":" + s2.a[1] + ":" + s2.d);
			
			s2.a[0] = 88;
			s2.a[1] = 89;
			
			System.out.println(s1.a[0] + ":" +s1.a[1] + ":"+ s1.d);
			System.out.println(s2.a[0] + ":" + s2.a[1] + ":" + s2.d);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
