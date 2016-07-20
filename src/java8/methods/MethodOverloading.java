package java8.methods;

public class MethodOverloading {
	
	public void printData() {
		System.out.println("print data with 0 arg");
	}
	
	/*public void printData(int a) {
		System.out.println("print data with 1 int arg" + a);
	}*/
	
	public double printData(double d) {
		System.out.println("print data with 1 double arg" + d);
		return d;
	}

}
