package Practise;

public class SortingArray {
	public static void main(String[] args) {
		int [] arr = {1,2,4,3,5,9,11,34,12,20};
		printArray(arr);
		sortingArray(arr);
		printArray(arr);
	}
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i] + " ");
		}
		System.out.println();
	}
	public static void sortingArray( int [] arr) {
		for (int i = 0; i <arr.length; i++) {
			for (int j =  1; j < i; j++) {
				if (arr [i] < arr [j]) {
					int temp = arr [i];
					arr [i] = arr [j];
					arr [j] = temp;
				}
			}
		}
	}

}
