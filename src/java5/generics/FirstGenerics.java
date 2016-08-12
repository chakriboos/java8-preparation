package java5.generics;

public class FirstGenerics<T> {
	
	T obj;
	
	FirstGenerics(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
	void displayType() {
		System.out.println("Type is : " + obj.getClass().getTypeName() + " : " + obj.getClass().getName());
	}
}
