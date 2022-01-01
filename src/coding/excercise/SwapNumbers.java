package coding.excercise;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		
		//Swap a and b without another variable
		a = a + b;
		b = a -b;
		a = a - b;
		
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		//Swap a and b with another variable 
		//Now a and b values swapped by above logic and we are bringing back to original
		int c = a;
		a = b;
		b = c;
		
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
	}

}
