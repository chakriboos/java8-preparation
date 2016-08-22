package java5.generics;

public class GenParent<T> {
	T obj;
	
	public GenParent(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}
