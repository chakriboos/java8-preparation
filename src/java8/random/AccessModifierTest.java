package java8.random;

public class AccessModifierTest extends RandomImmutableCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierTest object = new AccessModifierTest();
		System.out.println(object.getDefaultAccessVal());
	}
	
	public int getDefaultAccessVal() {
		return super.defaultModifierVal;
	}

}
