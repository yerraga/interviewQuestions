package DSA_Practise;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	
	Scanner reader = new Scanner (System.in);
	String str = reader.nextLine();
	System.out.println(str);

	for (int i = str.toCharArray().length-1; i>=0;i--) {
		
		System.out.print(str.charAt(i));
		
	}
	
}
}
