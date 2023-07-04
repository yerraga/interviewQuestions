package Java8Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindCommonElements {
	
	public static void main(String[] args) {
		int arr [] = {5,2,0,4,1,3,1};
		int arr1 [] = {5,6,7,8,4,3};
		System.out.println(secondSmallest(arr));
		System.out.println(commonElements(arr, arr1));
	}
	
	public static int secondSmallest(int [] arr) {
		return Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(null);
	}
	
	public static List<Integer> commonElements(int [] arr1, int [] arr2){
		List<Integer> list = Arrays.stream(arr1).filter(arr -> Arrays.stream(arr2)
				.anyMatch(arrNumber -> arrNumber == arr)).boxed().collect(Collectors.toList());
		return list;
		}
}
