package java8.interfaces;

public class AlphaBetaImpl implements Alpha, Beta {

	public void print() {
		System.out.println("AlphaBetaImpl print method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new AlphaBetaImpl();
		a.print();
		Beta b = new AlphaBetaImpl();
		b.print();
	}

}
