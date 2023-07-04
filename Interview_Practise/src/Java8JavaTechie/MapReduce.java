package Java8JavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduce {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Integer sumOfElements = Arrays.stream(arr).boxed().mapToInt(t -> t).sum();
		System.out.println(sumOfElements);
		Optional<Integer> sumOfElementsWithReduce = Arrays.stream(arr).boxed().reduce(Integer::sum);
		System.out.println(sumOfElementsWithReduce.get());
		System.out.println(sumOfElements(arr, arr.length));
		Integer multipyOfNumbers = Arrays.stream(arr).boxed().reduce(1, (a, b) -> a * b);
		System.out.println("Ganesh " + multipyOfNumbers);
		List<String> list = Arrays.asList("John Doe", "Jane Doe", "Bill Smith", "Susan Smith", "Michael Jones",
				"Sarah Jones", "David Williams", "Emily Williams", "Thomas Brown", "Laura Brown", "James Green",
				"Mary Green", "Christopher White", "Jennifer White", "Robert Black", "Nancy Black", "Daniel Garcia",
				"Maria Garcia", "Peter Hernandez", "Laura Hernandez");
		String longestString = list.stream().reduce((str1, str2) -> str2.length() > str1.length() ? str2 : str1).get();
		System.out.println(longestString);
	}

	public static int sumOfElements(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
		// .forEach(t -> System.out.println(t))
	}

}
