package java8.interfaces;

public class AlphaAndChildImpl implements Alpha, AlphaChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new AlphaAndChildImpl();
		a.print();
		AlphaAndChildImpl impl = new AlphaAndChildImpl();
		impl.callSuperDefault();
	}
	public void callSuperDefault() {
		//AlphaChild.super.print();
	}

}
