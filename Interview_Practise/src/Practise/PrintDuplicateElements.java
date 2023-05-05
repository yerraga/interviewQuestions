package Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateElements {
	public static void main(String[] args) {
		int [] arr = {21,1,32,45,67,54,76,67,98};
		List<int [] > arrList = Arrays.asList(arr);
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,10,2,12,12,12,13,14,14,13,15,15,16,16);
		//list.stream().filter 
			//	(e -> Collections.frequency(list, e) >1).collect(Collectors.toSet()).forEach(e -> System.out.print(e + " " + "\n"));
		Map<Integer, Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		count.entrySet().stream().filter(e -> e.getValue()>1).
		forEach(e -> System.out.println("Entry " + e.getKey() + " has " + e.getValue()+ "duplicates"));
		Map <int [], Long> elements = arrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		elements.entrySet().stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println("Entry " + e.getKey() + " has " + e.getValue() + "duplicates"));
	}
}
