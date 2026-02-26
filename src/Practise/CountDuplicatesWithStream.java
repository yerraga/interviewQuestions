package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicatesWithStream {
	
	public static void main(String[] args) {
		String [] arr = {"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy",
				"Sunil", "Anasuyamma", "NarashimhaReddy","Ganesh", "Sunil", "Anasuyamma","Ganesh", "Sunil"};
		List <String> list = Arrays.asList(arr);
		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		count.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry -> System.out.println("Entry : " + entry.getKey() + " has "+ entry.getValue()+ " duplicates"));
	}

}
	