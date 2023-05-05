package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStringArray {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy");
		//List<String> sortedList = list.stream().sorted((str1, str2) -> str2.length() - str1.length()).collect(Collectors.toList());
		//System.out.println(sortedList);
		
		String [] arr = {"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy"};
		//List<String> list1 = Arrays.asList(arr);//List<String> sortedArray =
		 Arrays.stream(arr).sorted((str1, str2) -> str1.length() - str2.length()).collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		
	}
}
