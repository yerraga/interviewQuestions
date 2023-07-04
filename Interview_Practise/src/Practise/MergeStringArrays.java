package Practise;

import java.util.Arrays;

public class MergeStringArrays {
	public static void main(String[] args) {
	String [] arr = {"Ganesh", "Sunil", "YNR"};
	String [] arr1 = {"YAS", "KCR", "Kiran", "Prajju"};
	System.out.println(Arrays.toString(mergeArrays(arr, arr1)));
	}
	public static String [] mergeArrays(String [] first, String [] second) {
		int i = 0, j = 0, k =0;
		String [] mergedArray = new String [first.length+ second.length];
		while(i < first.length) {
			mergedArray[k] = first[i];
			i++;
			k++;
		}
		while (j < second.length ) {
			mergedArray[k] = second[j];
			j++;
			k++;
		}
		return mergedArray;
	}
}
