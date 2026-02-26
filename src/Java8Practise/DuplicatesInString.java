package Java8Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str = "i love java and java welcomes you";
		List <String> list = Arrays.asList(str.split(""));
		//finding duplicate elements
		Set<String> set = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
	System.out.println(set);
	// finding unique element
	Set <String> uniqueSet = list.stream().filter(e -> Collections.frequency(list, e) == 1).collect(Collectors.toSet());
	System.out.println(uniqueSet);
	}
}
