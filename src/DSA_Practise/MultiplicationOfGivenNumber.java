package DSA_Practise;

import java.util.Scanner;

public class MultiplicationOfGivenNumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int n = reader.nextInt();
		multiplication(n);
	}
	public static void multiplication(int n) {
		for (int i = 0; i <11; i++) {
			System.out.println(n + " X " + i + " " + "= " + n*i);
		}
	}
}
