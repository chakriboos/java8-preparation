package java5.generics;

public class GenB<T> extends GenA<T> {
	T obj;
	
	public GenB(T obj) {
		super(obj);
		this.obj = obj;
	}
	
}
