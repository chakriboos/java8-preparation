package java5.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class FirstAnnotationDemo {
	
	@FirstAnnotation(str = "first annotation", val = 1000)
	public void myMethod() {
		//Comment901 added in master
		//Comment902 added in master
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		FirstAnnotationDemo demo = new FirstAnnotationDemo();
		Class<?> classObj = demo.getClass();
		Method method = classObj.getMethod("myMethod");
		FirstAnnotation fa = method.getAnnotation(FirstAnnotation.class);
		System.out.println(fa.str() + "---" + fa.val());
		
	}

}
