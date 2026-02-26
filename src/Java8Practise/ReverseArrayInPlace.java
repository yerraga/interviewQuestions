package Java8Practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInPlace {
	
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5};
		revesrseArray(arr);
	}
	public static void revesrseArray(int [] arr) {
		  IntStream.range(0, arr.length/2).forEach(num -> {
			int temp = arr[num];
			arr[num] = arr[arr.length - num - 1];
			arr[arr.length - num - 1] = temp;
			
		 });
		System.out.println(Arrays.toString(arr));
	}

}
