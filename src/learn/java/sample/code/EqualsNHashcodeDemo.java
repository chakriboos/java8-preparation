package learn.java.sample.code;

public class EqualsNHashcodeDemo {

	public static void main(String[] args) {
		//Create 2 employee objects
		Employee e1 = new Employee("Adam", 1);
		Employee e2 = new Employee("Adam", 1);
		
		Student s1 = new Student("Charlie", 1);
		System.out.println("S1 EQUALS S1 : " + s1.equals(s1));
		System.out.println("S1 Hashcode : " + s1.hashCode());
		
		
		//Call hashcode and equals methods
		System.out.println("EQUALS : " + e1.equals(e2));
		System.out.println("E1 HASH CODE : " + e1.hashCode());
		System.out.println("E2 HASH CODE : " + e2.hashCode());
		
	}

}
