package Practise;

public class Factorial {
public static void main(String[] args) {
	int result = factorial(4);
	System.out.println(result);
}
 public static int factorial(int n) {
		if (n ==1 || n ==0) {
			return 1;
		}

		return n*factorial(n-1);
 }
}
