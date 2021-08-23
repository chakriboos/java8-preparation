package learn.java8;

import java.util.function.Function;

@FunctionalInterface
public interface MyOwnFunctionalInterface<T, R> extends Function<T, R> {
	
	//void doSomething();
}
