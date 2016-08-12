package java8.threads;

public class ImplementsRunnable implements Runnable {
	private Thread t;
	
	ImplementsRunnable(String threadName) {
		t = new Thread(this, threadName);
		System.out.println("New thread " + t);
		t.start();
	}
	
	public void run() {
		for (int i = 3; i > 0; i--) {
			System.out.println("i val : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
