package java8.random;

public class DeadAndUnreachableCode {

	public static void main(String[] args) {
		// compilation warning
		if (false) {
			
		}
		
		// compilation error
		/*while (false) {
			
		}*/
	}

}
