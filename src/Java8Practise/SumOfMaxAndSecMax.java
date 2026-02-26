package Java8Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfMaxAndSecMax {
	
	public static void main(String[] args) {
		int [] arr = {5,9,11,2,8,21,1};
		List <int []> list = Arrays.asList(arr);
		int sumofNumbers = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
				.limit(2).mapToInt(Integer::intValue).sum();
		System.out.println(sumofNumbers);
	}

}
