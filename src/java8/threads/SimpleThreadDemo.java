package java8.threads;

public class SimpleThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Dwaras");
		System.out.println(t);

	}

}
