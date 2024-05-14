package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideStringArray {
	public static void main(String[] args) {
	String [] arr = {"Ganesh", "Sunil", "YNR", "YAS", "KCR", "Kiran", "Prajju"};
	System.out.println(Arrays.deepToString(divideArray(arr, 3).toArray()));
	}
	public static List<String []> divideArray(String [] arr, int chunkSize){
		List <String[] > chunks = new ArrayList<>();
		for (int i = 0; i<arr.length; i+=chunkSize) {
			int end = Math.min(arr.length, i+chunkSize);
			String [] chunk = Arrays.copyOfRange(arr, i, end);
			chunks.add(chunk);
		}
		return chunks;	
	}
}
