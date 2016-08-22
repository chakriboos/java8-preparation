package java8.lambdas.constructorref;

public class MyClass {
	
	private int val;
	
	/*public MyClass() {
		val = 0;
	}*/
	
	MyClass(int val) {
		this.val = val;
	}
	
	int getVal() {
		return val;
	}
}
