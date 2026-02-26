package DSA_Practise;

import java.util.Arrays;

public class CountingDuplicates {
	// 3, 4, 7, 9, 3, 4, 9, 3, 7
	
	public static void main(String[] args) {
		int [] arr =  { 3, 4, 7, 9, 3, 4, 9, 3, 7};
		printDuplicates(arr);
	}
	public static void printDuplicates( int [] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length  ; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length ; j++) {
				if (arr[i] == arr [j]) {
					count++;
				}
				else {
					break;
				}
			}
			if (count > 1)
			System.out.println(arr [i] + " " + count);
			 i = i + count - 1;
		}
		
	}
	

}
