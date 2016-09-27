package java8.lang;

public class CloneTest implements Cloneable {
	int a;
	double b;
	
	CloneTest cloneObj() throws Exception {
		return (CloneTest) super.clone();
	}
}
