package learn.java8;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "java supplier interface";
		
		System.out.println(supplier.get());
	}

}
