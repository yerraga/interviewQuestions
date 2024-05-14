package Practise;

public class ReversingStringAndRemovingDuplicates {
	public static void main(String[] args) {
		String str = "banana";
		System.out.println(reverseOfString(str));
	}
	public static String reverseOfString(String str) {
		char arr [] = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			char letter = arr[start];
			arr[start] = arr[end];
			arr[end] = letter;
			start++;
			end--;
		}
		System.out.println(arr);
		for (int i = 0; i < arr.length - 1; i++){
			for (int j = i + 1; j < arr.length ; j ++) {
				if(arr[i] > arr[j]) {
					char letter = arr[i];
					arr[i] = arr[j];
					arr[j] = letter;
				}
			}
		}
		 int newSize = 0;
	        char[] uniqueArr = new char[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < newSize; j++) {
	                if (arr[i] == uniqueArr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                uniqueArr[newSize] = arr[i];
	                newSize++;
	            }
	        }
		return new String (uniqueArr);
		
	}
}
