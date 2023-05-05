package Java8Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstNonReaptingCharacterInString {

	public static void main(String[] args) {
		String str = "i love java and java welcomes you";
		List <String> list = Arrays.asList(str.split(""));
		
		String firstUniqueElement = list.stream().filter(e -> Collections.frequency(list, e) == 1).findFirst().orElse(null);
		System.out.println(firstUniqueElement);
	
		String str1 = "Ganesh";
		List <String> list1 = Arrays.asList(str1.split(""));
		str1 = list1.stream().filter(e -> Collections.frequency(list1, e) == 1).findFirst().orElse(null);
		System.out.println(str1);
	}

}
