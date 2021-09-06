package learn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService exeService = Executors.newFixedThreadPool(5);
		
		exeService.execute(null);

	}

}
