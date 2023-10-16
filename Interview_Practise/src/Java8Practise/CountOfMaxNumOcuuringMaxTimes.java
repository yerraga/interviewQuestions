package Java8Practise;

import java.util.HashMap;
import java.util.Map;

public class CountOfMaxNumOcuuringMaxTimes {

	public static void main(String[] args) {
		
	}
// this code not returning correct values modify this file
	    public int solution(int[] A) {
	        Map <Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : A){
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+ 1);

	        }

	        int maxOccurance = 0;
	        int maxValue = 0;

	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
	            int value = entry.getKey();
	            int occurence = entry.getValue();
	            if (value == occurence && occurence > maxOccurance){
	                maxOccurance = occurence;
	                maxValue = value;
	            }
	        }
	        return maxValue;
	    }
	

}
