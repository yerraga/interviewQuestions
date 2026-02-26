package Java8JavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
	Predicate <Integer> predicate = (t) -> t % 2 == 0;
	System.out.println(predicate.test(11));
	List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	list.stream().filter(predicate).forEach(t -> System.out.print(t + " "));
	}
}
