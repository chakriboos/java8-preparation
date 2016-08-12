package java8.threads;

public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImplementsRunnable("first");
		new ImplementsRunnable("second");
		new ImplementsRunnable("third");
		
		try {
			Thread.sleep(7500);
			System.out.println("sleep time completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
