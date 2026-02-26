package DSA_Practise;

public class SwapNumbersWithoutThirdVariable {
	
	public static void main(String[] args) {
		int a = 2, b = 3;
		
		System.out.println("Given variables are : " + a + "," + b);
		//SayyadVali.Shaik@TechMahindra.com
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping variables are : " + a + "," + b);
		
	}

}
