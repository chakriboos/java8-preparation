package coding.excercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class PalindromeUsingQueue {

	public static void main(String[] args) {
		String input = "mam";
		
		//Declare queue and stack
		Queue<Character> charQueue = new LinkedList<Character>();
		Stack<Character> charStack = new Stack<Character>();
		
		//Add each character to queue and stack
		for (Character c : input.toCharArray()) {
			charQueue.add(c);
			charStack.push(c);
		}
		
		Boolean palindrome = true;
		
		//Pop 1 char at a time and verify both
		for (int i = 0; i < input.length(); i++) {
			if (! charQueue.remove().equals(charStack.pop())) {
				palindrome = false;
			}
		}
		
		System.out.println("Given string :" + input + ": is palindrome : " + palindrome);
	}

}
