package Java8Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighestNumber {
	    public static void main(String[] args) {
	        int[] array = {3,4,2,4,6,3,7,8,5};
	        nthMaxElementStream(array,4);
	    }
	    public static void nthMaxElementStream(int[] array, int n) {
	    	List <Integer> set = Arrays.stream(array).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    	System.out.println(set);
	    	Integer highestNumber =  (Integer) set.toArray()[n - 1];
	    	System.out.println("The " + n + "th highest element is " + highestNumber);
	    }

}
