package java8.accessmodifier;

public class StaticBlock {
	static int a =10;
	static int b = 20;
	
	static {
		System.out.println("in static block");
		b = a * 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb = new StaticBlock();
		System.out.println(sb.a + "  " + sb.b);
		sb.printData();
	}
	
	public void printData() {
		System.out.println(StaticVariablesAndMethods.a);
	}

}
