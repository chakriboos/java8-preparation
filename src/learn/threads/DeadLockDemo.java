package learn.threads;


/**
 * To create a dead lock in java
 * @author divyadwarasala
 *
 */
public class DeadLockDemo {

	public static void main(String[] args) {
		
		Object book = new Object();
		Object pen = new Object();
		
		Writer1 w1 = new Writer1(book, pen);
		Writer2 w2 = new Writer2(book, pen);
		
		w1.run();
		w2.run();
	}

}

class Writer1 extends Thread {
	Object book;
	Object pen;
		
	public Writer1(Object book, Object pen) {
		this.book = book;
		this.pen = pen;
	}
	
	@Override
	public void run() {
		synchronized (book) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (pen) {
				System.out.println("Writer1 writing");
			}
		}
	}
}

class Writer2 extends Thread {
	Object book;
	Object pen;
	
	public Writer2(Object book, Object pen) {
		this.book = book;
		this.pen = pen;
	}
	
	@Override
	public void run() {
		synchronized (pen) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (book) {
				System.out.println("Writer2 writing");
			}
		}
	}
}
