package java5.generics;

public class ExtendsDemo {
	
	public static void main(String args[]) {
		ExtendsClass<Number> obj1 = new ExtendsClass<>();
		obj1.printMsg(" extends number");
		ExtendsClass<Integer> obj2 = new ExtendsClass<>();
		obj2.printMsg(" extends integer");
	}
}	
