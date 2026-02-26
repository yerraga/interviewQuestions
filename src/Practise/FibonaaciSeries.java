package Practise;

public class FibonaaciSeries {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;

		System.out.print(n1 + " " + n2);

		while (n1 + n2 <= 50) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
