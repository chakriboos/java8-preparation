package java5.varargs;

public class VarArgsDemo {
	
	public void printSum(int ... a) {
		int sum = 0;
		System.out.println("a length" + a.length);
		for(int x : a) {
			sum += x;
		}
		System.out.println("TOTAL : " + sum);
	}
	
	//invalid
	/*public void printSum(int a, int ... b, int c) {
		
	}*/
	/*public void printSum(int a, int ... b, double ... d) {
		
	}*/
	
	public static void main(String[] args) {
		//Master Comment1 added
		//Master Comment2 added
		//Master Comment3 added
		VarArgsDemo v = new VarArgsDemo();
		v.printSum(10,20,30);
		v.printSum(10,20,30,1,1,1,1,1);
		v.printSum();
	}

}
