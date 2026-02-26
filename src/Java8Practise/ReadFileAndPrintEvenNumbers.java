package Java8Practise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileAndPrintEvenNumbers {
	public static List<Integer> extractEvenNumbersFromFile(String filePath) {
		List<Integer> evenNumbers = new ArrayList<>();
		try {
			evenNumbers = Files.lines(Paths.get(filePath)).
					map(line -> line.split(" ")) // Split each line by whitespace
					.flatMap(Arrays::stream) // Flatten the array of words into a stream
					.filter(ReadFileAndPrintEvenNumbers::isInteger) // Filter out non-integer strings
					.map(Integer::parseInt) // Convert strings to integers
					.filter(num -> num > 0 && num % 2 == 0 ) // Filter even numbers
					.collect(Collectors.toList()); // Collect the even numbers into a list
		} catch (IOException e) {
			e.printStackTrace();
		}
		return evenNumbers;
	}

	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Ganesh.txt";
		//List<Integer> evenNumbers = extractEvenNumbersFromFile(fileName);
		System.out.println(extractEvenNumbersFromFile(fileName));
	}

}
