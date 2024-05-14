package Java8Practise;

import java.util.Arrays;
import java.util.List;

public class LengthOfLongestString {
	
	public static void main(String[] args) {
		String [] arr = {"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy", "Yerragorla Ganesh Yadav"};
		List<String> list = Arrays.asList(arr);
		String str = list.stream().reduce((str1, str2) -> str2.length() > str1.length() ? str2 : str1).get();
		System.out.println(str + ":" + str.length());
	}

}
