package Java8JavaTechie;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo  {
     public static void main(String[] args) {
    	 List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
          System.out.println(list.stream().findAny().
        		  orElseGet(() -> null));
	}
     
}
