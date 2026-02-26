package Java8Practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfCharInString {
	public static void main(String[] args) {
		String str = "i love java and java welcomes you";
		List <String> list = Arrays.asList(str.split(""));
		//counting characters in list format
		Map <String, List<String>> stringCount = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.toList()));
	System.out.println(stringCount);
	
	// counting characters in numbers
	Map <String, Long> intCount = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(intCount);
	}

}
