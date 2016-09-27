package java8.lang;

public class ClassMethodsDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		
		Class<?> objX = x.getClass();
		Class<?> objY = y.getClass();
		
		System.out.println(objX.getTypeName());
		System.out.println(objY.getTypeName());
		
		System.out.println(objX.getSuperclass());
		System.out.println(objY.getSuperclass());
		
		System.out.println(objX.getConstructor());
		System.out.println(objY.getConstructor());
		
		new ClassMethodsDemo().doNothing();
		new ClassMethodsDemo().doNothing("", "", "");
		new ClassMethodsDemo().doNothing("sdf", "sdfd");
	}
	
	public void doNothing(String... x) {
		System.out.println("inside donothing" + Math.abs(-40.33));
		
	}

}


