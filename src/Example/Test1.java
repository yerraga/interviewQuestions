package Example;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Please enter a :");
		int a = reader.nextInt();
		System.out.println("Please enter b :");
		int b = reader.nextInt();
		System.out.println("Please enter op :");
		char op = reader.next().charAt(0);
		switch (op) {
		case '+' : 
			System.out.println( "Sum of a and b is : " + (a + b));
			break;			
		case '-' :
			int result = a -b ;
			float sub = result;
			System.out.println( "Subtraction of a and b is : " + sub );
			
			break;
		case '*':
			System.out.println( "Multiplication  of a and b is : " + a * b);
			break;
		case '/':
			System.out.println( "Division of a and b is : " + a / b);
		}
		
		

	}
}
