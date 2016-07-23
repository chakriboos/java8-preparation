package java8.exception;

public class PreciseRethrowDemo {

	public void rethrowException() throws FirstException, SecondException {
		Object o = new Object();
		int a = 0;
		int b = 0;
		try {
			if (a == 0)
				throw new FirstException();
			if (b == 0)
				throw new SecondException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

}
