package java8.exception;

public class LabeledBreak {

	public static void main(String x[]) {
		int a = 0;
		
		one: 			for(; a ==0; ) {
			System.out.println("in one");
					break;
			}
		
		for (;a==0;) {
			break;//one;
		}
		first: {
			second: {
				if (a < 5)
					//break one;
				third: {
					System.out.println("in third");
				}
			}
			System.out.println("after second");
		}
		System.out.println("after first");
		
	}
}
