package java5.generics;

public class GenChild extends GenParent<String>{
	String str;
	
	public GenChild(String str) {
		super(str);
		this.str = str;
	}
	
	@Override
	String getObj() {
		System.out.println(str);
		return str;
	}
	
}
