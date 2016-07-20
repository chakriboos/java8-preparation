package java8.exception;

public class DefaultValuesDemo2 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	Parent1 p1;
	
	DefaultValuesDemo2(int a) {
		System.out.println("in zero param constructor");
		this.printDefaults();
	}
	
	public static void main(String[] args) {
		new DefaultValuesDemo2(9).printDefaults();
	}
	
	public void printDefaults() {
		// TODO Auto-generated method stub
				System.out.println(b);
				System.out.println(s);
				System.out.println(i);
				System.out.println(l);
				System.out.println(f);
				System.out.println(d);
				System.out.println(c);
				System.out.println(p1);
	}

}
