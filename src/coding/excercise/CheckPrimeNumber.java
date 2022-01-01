package coding.excercise;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Is PRIME : " + checkPrime(3));
		
		
	}
	
	private static boolean checkPrime(int input) {
		boolean isPrime = true;
		
		if (input == 0 || input == 1) {
			isPrime = false;
		}
		
		for(int i = 2; i <= input/2; i++) {
			if (input % i == 0) {
				isPrime = false;
			}
		}
		
		return isPrime;
	}

}
