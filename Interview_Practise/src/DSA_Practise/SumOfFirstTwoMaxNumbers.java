package DSA_Practise;

public class SumOfFirstTwoMaxNumbers {
	public static void main(String[] args) {
		int [] arr = {40,100,30,20,60,180};
		System.out.println(sumOfNumbers(arr));
	}
   public static int sumOfNumbers(int [] arr) {
	   int secMax = 0;
	   int max = 0;
	   int sum = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr [i] > max ) {
			secMax = max;
			max = arr[i];
		}
		if (arr [i] > secMax && arr [i] != max) {
			secMax = arr[i];
			
		}
		sum = secMax + max;
	}
	return sum;
   }
   
}
