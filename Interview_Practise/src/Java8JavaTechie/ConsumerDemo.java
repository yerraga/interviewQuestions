package Java8JavaTechie;

import java.util.function.Consumer;

public class ConsumerDemo{


	
	public static void main(String[] args) {

		Consumer <Integer> consumer = (t) -> System.out.println("Result: " + t*t);
		consumer.accept(10);
	}
	

}
