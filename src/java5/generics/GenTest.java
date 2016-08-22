package java5.generics;

public class GenTest<T> {
	T obj;
	//static T obj; EEROR

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void test() {
		//obj = new T(); ERROR
	}
	
	//ERROR
	/*static T getObj() {
		
	}*/
	
	static <T> void getObj() {
		
	}
	
	T getTypeParam() {
		return obj;
	}

}
