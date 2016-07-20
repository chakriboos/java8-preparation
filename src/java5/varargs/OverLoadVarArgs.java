package java5.varargs;

public class OverLoadVarArgs {
	
	public void printMsg(String msg) {
		System.out.println("1 normal param");
	}
	
	public void printMsg(String msg, int ... a) {
		System.out.println("1 normal param + 1 varargs param");
	}
	
	public void printMsg(int ... a) {
		System.out.println("1 varargs param");
	}
	
	public void printMsg(int a, int ... b) {
		System.out.println("1 varargs param");
	}
	
	public void printMsg(boolean ... b) {
		System.out.println("1 varargs param");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadVarArgs a = new OverLoadVarArgs();
		a.printMsg("hi", 1);
		// ERROR a.printMsg();
		// ERROR a.printMsg(1);
	}

}
