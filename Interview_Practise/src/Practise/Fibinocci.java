package Practise;

public class Fibinocci {
	
	public static void main(String[] args) {
		int result = fibinocci(6);
		System.out.println(result);
	}
	public static int fibinocci( int n) {
		if (n == 1 || n==0) {
			return n;
		}
		if (n <0) {
			return -1;
		}
		return fibinocci(n-1) + fibinocci(n-2);
		
	}

}
