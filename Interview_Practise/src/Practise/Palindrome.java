package Practise;

public class Palindrome {

	public static void main(String[] args) {
		if (isPalindrome("GaneshsenaG")) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
	}

	public static boolean isPalindrome(String str) {
		String string = str.toLowerCase();
		System.out.println(string);
		char [] arr = string.toCharArray();
		int start = 0;
		int end = arr.length -1;
		while (start < end) {
		if (arr[start] == arr[end]) {
			start ++;
			end --;
			return true;
			
		}
	
		}
		return false;
	}
}
