package Practise;
import java.util.*;
public class DivideArray {
	public static void main(String[] args) {
		int [] arr = {11,12,13,14,15,16,17,18,19};
		List<int []> chunks = chunkedArray(arr, 3);
		System.out.println(Arrays.deepToString(chunks.toArray()));
	}
	
	public static List<int[]> chunkedArray(int [] arr, int chunkSize){
		List <int [] > chunks = new ArrayList<>();
		for (int i = 0; i < arr.length; i = i+chunkSize) {
			int end = Math.min(arr.length, i+chunkSize);
			int [] chunk = Arrays.copyOfRange(arr, i, end);
			chunks.add(chunk);
		}
		return chunks;
	}

}
