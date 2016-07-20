package java8.exception;

public class ForLoopTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arra[] = {3,4,5};
		System.out.println(arra.length);
		int a, b;
		a = b = 0;
		//basic
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			if(i == 4) break;
			System.out.println("not part of loop");
			if(i == 5) break;
		}
		
		//for with more than one stmt in both initialization n increment
		for(; (a < 3 & b < 3); a++, b++) {
			System.out.println(a + " " + b);
			
		}
		
		for(;;) {
			System.out.println("Infinite loop");
			System.exit(0);
		}
		
		
	}

}
