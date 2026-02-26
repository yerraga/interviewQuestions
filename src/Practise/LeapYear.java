package Practise;

public class LeapYear {
public static void main(String[] args) {
	System.out.println(isLeapYear(3000));
}

private static boolean isLeapYear(int n) {
	
	if (n % 100 == 0 ) {
		if (n % 400 == 0) {
		return true;
		}
	}
	else if (n % 4 ==0) {
		return true;
	}
	return false;
}
}
