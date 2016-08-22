package java8.lambdas.constructorref;

public class MyClassDemo {

	public static void main(String[] args) {
		
		FuncInterface fiObj = MyClass::new;
		
		MyClass obj1 = fiObj.getClassObj(1000);
		
		System.out.println(obj1.getVal());
		
	}

}
