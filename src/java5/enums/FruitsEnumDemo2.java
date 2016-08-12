package java5.enums;

public class FruitsEnumDemo2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitsEnum e1, e2, e3;
		for(FruitsEnum e : FruitsEnum.values()) {
			System.out.println(e + " - " + e.ordinal());
		}
		e1 = FruitsEnum.Kiwi;
		e2 = FruitsEnum.Apple;
		e3 = FruitsEnum.Grape;
		
		System.out.println(e2.compareTo(e1));
		System.out.println(e2.compareTo(e2));
		System.out.println(e3.compareTo(e2));
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e2));

	}

}
