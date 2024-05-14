package Example;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter number : ");
	int number = reader.nextInt();
	//int hlaf = number/2 ;
	
	for (int i = 2; i <= number/2; i ++) {
		if (number == 1 && number == 2) {
			System.out.println("Given number is neither prime nor composite number");
		}
		if (number % i == 0) {
			System.out.println("Given number is prime");
			break;
		}
		else {
			System.out.println("Given number is not a prime number");
		}
	}
}
}
