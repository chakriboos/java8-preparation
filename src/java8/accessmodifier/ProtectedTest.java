package java8.accessmodifier;

import java8.random.RandomImmutableCode;

public class ProtectedTest extends RandomImmutableCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedTest object = new ProtectedTest();
		System.out.println(object.getSuperVariable());
	}
	
	public int getSuperVariable() {
		return super.protectedValue;
	}

}
