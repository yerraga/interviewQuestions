package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurences {
	public static void main(String[] args) {
		String str = "welcome to java world";
		List <String> list = Arrays.asList(str.split(""));
		Map <String, Long> count = list.stream().
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
	}
}
