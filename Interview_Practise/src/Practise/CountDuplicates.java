package Practise;

import java.util.Arrays;

public class CountDuplicates {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,0,1,2,10,2,12,12,12,13,14,14,13,13,15,15,16,16};
		countDuplicates(arr);
	}
	public static void countDuplicates(int [] arr) {
		
		Arrays.sort(arr);
	System.out.print(Arrays.toString(arr));
	System.out.println();
		for (int i = 0; i < arr.length-1; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length ; j++) {
				if (arr[i] == arr [j]) {
					count++;
				}
				else {
					break;
				}
				if (count > 1) {
					System.out.println(arr [i] + " -> "+ count);
					//i= i + (count - 1);
				}
			}
		}
	}
}
