package Java8Practise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
        int number = 153; // Change this number to check for other values

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        int n = 0;

        originalNum = num;

        // Count the number of digits
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }

        originalNum = num;

        // Calculate the result
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
	

}

