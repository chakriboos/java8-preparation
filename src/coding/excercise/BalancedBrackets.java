package coding.excercise;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {

		final String input = "{[())]}";

		Boolean isClosedProperly = true;

		// Create stack
		Stack<Character> charStack = new Stack<Character>();

		// Read input string
		// If it is open bracket push to stack
		for (int i = 0; i < input.length() && isClosedProperly; i++) {
			Character currentChar = input.charAt(i);
			if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
				charStack.push(input.charAt(i));
				continue;
			}

			// If it is closing pop from stack
			switch (currentChar) {
			case ')': {
				Character topChar = charStack.pop();
				if (Character.compare(topChar, '(') != 0) {
					isClosedProperly = false;
				}
				break;

			}
			case '}': {
				Character topChar = charStack.pop();
				if (Character.compare(topChar, '{') != 0) {
					isClosedProperly = false;

				}
				break;

			}
			case ']': {
				Character topChar = charStack.pop();
				if (Character.compare(topChar, '[') != 0) {
					isClosedProperly = false;
				}
				break;

			}

			}

		}

		System.out.println("Given input :" + input + ": closed properly : " + isClosedProperly);

	}

}
