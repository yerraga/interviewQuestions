package Java8Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbersFromStringNumbers {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
		printEvenNumbers(list);
		System.out.println();
		System.out.println(printOddNumbers(list));
		}
	public static void printEvenNumbers(List<String> evenList){
		
	evenList.stream().filter(s -> Integer.parseInt(s) % 2 == 0).
	collect(Collectors.toList()).forEach(e -> System.out.print(e + " "));
	}
	
	public static List<Integer> printOddNumbers(List<String> oddList){
	
		return oddList.stream().
				map(Integer::parseInt).
				filter(n -> n % 2 !=0).
				collect(Collectors.toList());
				}
}
