package java8.assertions;

public class AssertDemo {

	static int val = 3;
	
	static int getVal() {
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			n = getVal();
			System.out.println(n);
			assert val > 0 : "N is negavtive";
		}
	}

}
