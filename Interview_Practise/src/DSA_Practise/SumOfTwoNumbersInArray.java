package DSA_Practise;

public class SumOfTwoNumbersInArray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumOfTwoNumbersIArray(arr, 2, 2));
	}
	
	public static int sumOfTwoNumbersIArray(int [] arr, int first, int second) {
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			if(i == first) {
			for (int j = 0; j< arr.length; j++) {
				if(j == second) {
					sum = arr [first] + arr [second];
				}
			}

			}
			
		}
		return sum;
	}

}
