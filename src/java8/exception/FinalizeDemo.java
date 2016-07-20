package java8.exception;

public class FinalizeDemo {
	/**
	 * 
	 * 
	Exception in thread "main" java.lang.IllegalMonitorStateException
	at java.lang.Object.wait(Native Method)
	at java8.exception.FinalizeDemo.main(FinalizeDemo.java:18)
	
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String s = "hi";
		s = null;
		Thread.class.wait(1000);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize start");
		super.finalize();
		System.out.println("finalize end");
	}

}
