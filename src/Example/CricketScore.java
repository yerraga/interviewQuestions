package Example;

import java.util.Scanner;

public class CricketScore {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Strike Rate : ");
		double strikeRate = reader.nextDouble();
		System.out.println("Enter total overs : ");
		int overs = reader.nextInt();
		
		
		System.out.println(calculateScore(strikeRate, overs));
	}
	
	public  static double calculateScore (double strikeRate, int overs) {
		return strikeRate*overs;
	}

}
