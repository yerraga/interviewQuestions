package Java8Practise;

import java.util.Arrays;
import java.util.List;

public class StringJoin {

	public static void main(String[] args) {
		String [] arr = {"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy", "Yerragorla Ganesh Yadav"};
		List <String> list = Arrays.asList(arr);
		String  result = String.join("-", list);
		System.out.println(result);
	}
}
