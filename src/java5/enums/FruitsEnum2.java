package java5.enums;

public enum FruitsEnum2 {
	Apple(5), Orange(6), Grape(7), Kiwi(8), Berry(9);
	
	private int price;
	
	FruitsEnum2(int a) {
		System.out.println("in fruitsenum2 constructor");
		price = a;
	}
	
	public void getPrice() {
		System.out.println("price : " + price);
	}
}
