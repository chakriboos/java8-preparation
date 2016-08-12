package java8.interfaces;

public interface InterfaceWithDefaultMethod {
	
	void printHello(String msg);
	
	static void getMsg(String msg) {
		System.out.println("default method");
	}
	
	default void getMsg2(String msg) {
		System.out.println("default method2");
	}
	
	
}
