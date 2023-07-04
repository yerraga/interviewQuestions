package Java8JavaTechie;

import java.util.Arrays;
import java.util.List;

public class SortListOfElements {
      public static void main(String[] args) {
    	  List <Integer> list = Arrays.asList(9,2,4,1,6,8,3,5,10,7);
    	  list.stream().sorted().forEach(System.out::print);
    	  System.out.println();
  		List<String> namesList = Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve", "Frank", "George", "Hannah", "Ian", "Jack",
				"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy", "Krishna", "Lakshmi", "Rama", "Sita", "Radha", "Krishna",
				"Arjuna", "Bhima", "Nakula", "Sahadeva");
  		namesList.stream().sorted().forEach(System.out::println);
	}
}
