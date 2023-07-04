package Java8JavaTechie;

import java.util.Arrays;
import java.util.List;

public class FilterAndForEach {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve", "Frank", "George", "Hannah", "Ian", "Jack",
				"Ganesh", "Sunil", "Anasuyamma", "NarashimhaReddy", "Krishna", "Lakshmi", "Rama", "Sita", "Radha", "Krishna",
				"Arjuna", "Bhima", "Nakula", "Sahadeva");
		list.stream().filter(names -> names.startsWith("S")).forEach(t -> System.out.println(t));
	}

}
