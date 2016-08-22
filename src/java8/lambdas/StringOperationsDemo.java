package java8.lambdas;

public class StringOperationsDemo {
	static final String inputStr = "LAMBDA";
	
	String doSomeOper(StringOperations obj, String str) {
		return obj.doSomeOperation(str);
	}
	
	public static void main(String[] args) {
		StringOperationsDemo demoObj = new StringOperationsDemo();
		System.out.println(demoObj.doSomeOper((a) -> a + " MODIFIED", inputStr));
		
		
	}

}
