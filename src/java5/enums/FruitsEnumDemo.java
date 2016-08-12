package java5.enums;

public class FruitsEnumDemo {
	FruitsEnum e1;
	FruitsEnum e2;
	
	FruitsEnumDemo(FruitsEnum e1, FruitsEnum e2) {
		this.e1 = e1;
		this.e2 = e2;
		System.out.println(e1);
		System.out.println(e2);
		e2 = FruitsEnum.Grape;
	}
	
	public static void main(String[] args) {
		FruitsEnumDemo demo = new FruitsEnumDemo(FruitsEnum.Grape, FruitsEnum.Apple);
		System.out.println("---------------------------");
		demo.compare();
		System.out.println("---------------------------");
		demo.enumAsSwitchArg();
		System.out.println("---------------------------");
		demo.useExistingMethods();
		
	}
	
	public void useExistingMethods() {
		FruitsEnum f[] = FruitsEnum.values();
		for(FruitsEnum a : f)
			System.out.println(a);
		FruitsEnum s = FruitsEnum.valueOf("Grape");
		System.out.println(FruitsEnum.valueOf("Grape1"));
		System.out.println(FruitsEnum.valueOf("Grape"));
	}
	
	public void compare() {
		if(e1 == e2)
			System.out.println("Equal");
	}
	
	public void enumAsSwitchArg() {
		switch(e1) {
			case Apple: 
				System.out.println("switch arg is apple");
			case Berry :
				System.out.println("switch arg is berry");
		case Grape:
			System.out.println("switch arg is grape");
		case Kiwi:
			System.out.println("switch arg is kiwi");
			break;
		case Orange:
			break;
		default:
			break;
		}
	}
}
