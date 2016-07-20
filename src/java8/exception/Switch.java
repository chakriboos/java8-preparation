package java8.exception;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch ("xX".toLowerCase()) {
		case "x"+"x":
			System.out.println("val is XX");
			break;
		case "xyz":
			System.out.println("val is xyz");
			break;

		default:
			System.out.println("no match");
			break;
		}
	}

}
