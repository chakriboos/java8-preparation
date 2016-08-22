package java8.lambdas;

public interface MyNum {
	
	double getVal();
	
	default String getMsg(String one, String two) {
		return one + two;
	}

	
}
