package Practise;

public class SecondMaxElement {
	public static void main(String[] args) {
		int [] arr = {21,1,180,32,45,67,54,1176,67,98};
		//printArray(arr);
		int result = findSecondMaxElement(arr);
		System.out.println(result);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
	public static void printArray(int [] arr) {
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr [i] + " ");
		}
	}
	public static int findSecondMaxElement( int [] arr) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] > max) {
				secMax = max;
				max = arr[i];
			}
			if (arr [i] > secMax && arr [i] != max) {
				secMax = arr [i];
			}
		}
		return secMax;
	}

}
