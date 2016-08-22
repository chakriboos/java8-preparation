package java5.generics;

public class GenA<T> {
	T obj;
	
	public GenA(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}

}
