package Example;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int i = reader.nextInt();
		System.out.println(isOdd(i));

	}

	public static String isOdd(int i) {
		try {
			if (i % 2 == 0) {
				return " is even number";
			} else if (i % 2 != 0) {
				return " is odd number";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
