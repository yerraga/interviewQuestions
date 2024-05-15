package Java8Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThread  extends Thread{
   public void run() {
	   List<String> list = Arrays.asList("abba","baba", "abcba", "acca", "abab");
	   System.out.println(listOfPalindromes(list));
   }
   public List<String> listOfPalindromes(List<String> str){
	   List<String>palindromeList = new ArrayList<>();
	   for(String palindromeString : str) {
		   if (isPalindrome(palindromeString)) {
			   palindromeList.add(palindromeString);
		   }
	   }
	   return palindromeList;
   }

	private boolean isPalindrome(String str) {
		char [] arr = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] == arr[end]) {
				start ++;
				end --;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
