package Java8JavaTechie;

import java.util.stream.IntStream;

public class ParallelStream {
	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(x -> System.out.println("Thread running is :" + Thread.currentThread().getName() + x));
		end = System.currentTimeMillis();
		System.out.println("Time taken to run program : " + (end - start));
		System.out.println("==============================================");
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(x -> System.out.println("Thread running is :" + Thread.currentThread().getName() + x));
		end = System.currentTimeMillis();
		System.out.println("Time taken to run program : " + (end - start));
		System.out.println("==============================================");
	}

}
