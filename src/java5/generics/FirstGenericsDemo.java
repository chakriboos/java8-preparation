package java5.generics;

public class FirstGenericsDemo {

	public static void main(String[] args) {
		
		FirstGenerics<Integer> intObj;
		
		intObj = new FirstGenerics<Integer>(514);
		
		intObj.displayType();
		
		int i = intObj.getObj();
		
		System.out.println(i);
		
		FirstGenerics<String> strObj = new FirstGenerics<String>("xyz");
		
		strObj.displayType();
		
		System.out.println(strObj.getObj());
	}

}
