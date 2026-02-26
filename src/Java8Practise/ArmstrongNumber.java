package Java8Practise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 163;
		if (isArmstrongNumber(num)) {
			System.out.println(num + " : is Armstrong number");
		} else {
			System.out.println(num + " : is not Armstrong number");
		}
	}

	public static boolean isArmstrongNumber(int num) {
		int n = countDigits(num);
		if (num != calculateNumwithPower(num, n)) {
			return false;
		}
		return true;
	}

	public static int countDigits(int num) {
		int n = 0;
		while (num != 0) {
			num = num / 10;
			n++;
		}
		return n;
	}

	public static int calculateNumwithPower(int num, int n) {
		int result = 0;
		while (num != 0) {
			result +=calculatePower(n, num);
			num = num / 10;
		}
		return result;
	}
	
	public static int calculatePower(int n, int num) {
		int number = 1;
		int reminder = num%10;
		while (n !=0) {
			number *= reminder;
			n--;
		}
		return number;
	}

}
