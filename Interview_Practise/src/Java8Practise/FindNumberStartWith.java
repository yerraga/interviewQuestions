package Java8Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartWith {
	public static void main(String[] args) {
		int [] arr = {5,9,11,2,8,21,1};
		
		List <String> startWith = Arrays.stream(arr).boxed().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
		System.out.println(startWith);
	}
}
