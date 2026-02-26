package Practise;

public class FindPrimeNumber {
	public static void main(String[] args) {
		int i,m=0;
				boolean flag= false;      
		  int n=13;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag= true;;      
		     break;      
		    }      
		   }      
		   if(flag == false)  { System.out.println(n+" is prime number"); }  
		  }//end 
		
		
	}

}
