package Java8Practise;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaximumElement {
	
	public static void main(String[] args) {
		
		int [] arr = {5,9,11,2,8,21,1};
		
		// Second highest element
		Integer secondMaxElement = Arrays.stream(arr).boxed().
												sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondMaxElement);
		
		// Second lowest number
		
		Integer secondMinElement = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
		System.out.println(secondMinElement);
		
	}

}
//https://www.youtube.com/playlist?list=PLyHJZXNdCXsdeusn4OM33415DCMQ6sUKy


//https://www.youtube.com/watch?v=k7fNLXoVCYg