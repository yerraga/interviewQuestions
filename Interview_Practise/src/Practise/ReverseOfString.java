package Practise;

public class ReverseOfString {
	// Hello -----> olleH
	public static String reverseOfString(String str) {
		char [] arr = str.toCharArray();
		int start = 0;
		int end = arr.length-1;
		while (start < end) {
			char temp = arr[start];
			arr [start] = arr [end];
			arr [end] = temp;
			start++;
			end --;
		}
		
		return new String (arr);
		
	}
	public static void main(String[] args) {
		System.out.println(reverseOfString("Ganesh"));
	}
}
