package DSA_Practise;

import java.util.Arrays;

public class IndexOfElements {
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(indexOfElements(arr, 10)));
	}
	public static int [] indexOfElements(int [] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length ; j++) {
				if (arr[i] + arr [j] == target) {
					return new int [] {i, j};
				}
			}
		}
		return null;
	}

}
