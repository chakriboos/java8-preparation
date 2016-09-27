package java8.wrappers;

public class CharacterWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character  c = new Character('d');
		
		System.out.println(c.compareTo('d'));
		
		System.out.println(":" + Character.forDigit(12, 16) + ":");
		System.out.println(Character.digit('!', 10));
		System.out.println(Character.digit(' ', 10));
		System.out.println(Character.digit('a', 16));
		System.out.println(Character.digit('D', 16));
		
	}	

}
