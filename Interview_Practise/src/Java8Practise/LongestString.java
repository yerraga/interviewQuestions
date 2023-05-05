package Java8Practise;

import java.util.Arrays;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		String [] arr = {"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy", "Yerragorla Ganesh Yadav"};
		
		List <String> list = Arrays.asList(arr);
		String s = list.stream().reduce((str1 , str2) -> str1.length() < str2.length() ? str2 : str1).get();
	System.out.println(s);
	}
}
