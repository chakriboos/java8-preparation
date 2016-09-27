package java8.wrappers;

public class DoubleWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d = new Double(1.23f);
		System.out.println(d);
		
		Double d2 = new Double(0/0.);
		System.out.println(d2.isInfinite() + " : " + d2.isNaN());
	}

}
