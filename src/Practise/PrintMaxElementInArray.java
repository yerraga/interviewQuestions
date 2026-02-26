package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class PrintMaxElementInArray {
	public static void main(String[] args) {
		int [] arr = {2,4,6,3,7,8};
		  
		  OptionalInt maxEven = Arrays.stream(arr).sorted().filter(e -> e % 2 == 0).max();
		  System.out.println(maxEven);
		  
	}

}
