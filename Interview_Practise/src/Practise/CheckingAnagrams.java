package Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckingAnagrams {
	public static void main(String[] args) {
	System.out.println(stringAnagram("Mary", "Army"));
	}
	public static boolean stringAnagram(String str1, String str2) {
	    if (str1.length() != str2.length()) {
	        return false;
	    }
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char [] arr = str1.toCharArray();
		char [] arr1 = str2.toCharArray();
	    Arrays.sort(arr);
	    Arrays.sort(arr1);
	    return Arrays.equals(arr, arr1);
	}
}
