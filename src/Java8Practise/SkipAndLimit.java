package Java8Practise;

import java.util.stream.IntStream;

public class SkipAndLimit {

	public static void main(String[] args) {
		IntStream.range(1,10).skip(1).limit(8).forEach(System.out::print);
		
	}
}
