package Practise;

import java.util.Scanner;

public class NonReaptingString {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		String str = reader.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;
			for (int j = 1; j < str.length(); j ++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
				if (flag) {
					System.out.print(str.charAt(i) + " ");
					break;
				}
			}
		}	
	


}
