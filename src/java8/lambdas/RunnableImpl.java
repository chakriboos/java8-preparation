package java8.lambdas;

public class RunnableImpl {

	public static void main(String[] args) {
		
		
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Inside lambda run method");
			}
		});
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside main method");
		}
		
	}

}
