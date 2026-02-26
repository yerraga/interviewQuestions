package Practise;

public class FindOddAndEven {
	public static void main(String[] args) {
		oddOrEven(9898);
		System.out.println(odd(19));
		int oddCount = printOddNumbers(10);
		System.out.println(oddCount + ": total number of odd numbers");
		int evenCount = printEvenNumbers(10);
		System.out.println(evenCount + ": total number of even numbers");
	}
	public static boolean odd(int n) {
		return (n & 1) == 1;
	}
	public static void oddOrEven(int n) {
		if (n == 1) {
			System.out.println(n + ": is odd number");
		}
		if (n% 2 == 0) {
			System.out.println(n + ": is even number");
		}
		if (n % 2 == 1) {
			System.out.println(n + ": is odd number");
		}
	}
	public static int printOddNumbers(int n) {
		int result = 0;
		for (int i = 1; i<=n; i++) {

			if (i % 2 != 0) {
				 result = result+1;
				System.out.println(i + ": is odd number");
			}	
			}
		return result;
		}
	public static int printEvenNumbers(int n) {
		int result = 0;
		for (int i = 1; i<=n; i++) {

			if (i % 2 == 0) {
				 result = result+1;
				System.out.println(i + ": is even number");
			}	
			}
		return result;
		}
	}


