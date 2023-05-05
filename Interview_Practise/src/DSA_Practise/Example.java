package DSA_Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
 public static void main(String[] args) {
	 String s = "Welcome to Java World and Java Welcomes you";

	 List <String> list = Arrays.asList(s.split(""));
	  String str = list.stream().filter(e -> Collections.frequency(list, e) > 1).findFirst().get();
	  System.out.println(str);
}
}
