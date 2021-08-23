package java8.lambdas;

public class FunctionalInterfaceDemo {
	
	public static void main(String args[]) {
//		SampleFunctionalInterface1 impl1 = new Sample1Impl();
//		impl1.doNothing();
		
		SampleFunctionalInterface1 impl1 = () -> System.out.print("Inside FunctionalInterfaceDemo main method");
		
		impl1.doNothing();
	}
}
