package learn.threads;

class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.print("1");
		}
	}
	
}

class RunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.print("2");
		}
		
	}
	
}

public class ThreadVSRunnable {

	public static void main(String[] args) {
		//Call my thread
		MyThread mt1 = new MyThread();
		mt1.run();
		
		//call runnable impl
		RunnableImpl ri = new RunnableImpl();
		Thread t2 = new Thread(ri);
		t2.start();
		
	}

}


