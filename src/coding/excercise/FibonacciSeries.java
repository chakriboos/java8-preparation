package coding.excercise;

public class FibonacciSeries {

	public static void main(String[] args) {
		int input = 1;
		if (input > 0)
		System.out.println(input + " th fibonacci number is : " + getFibonacciNumber(input));
		getFibonacciSeries(10);
	}

	// Get fibonacci by recursion
	// Method will return nth fobinacci number
	private static int getFibonacciNumber(int n) {
		// int fibonacciNumber = 0;
		if (n == 0) // {
			return 0;
		if (n == 1 || n == 2) {
			return 1;
		}

		return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
	}

	// Print Fibonacci series
	private static void getFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
	}
}
