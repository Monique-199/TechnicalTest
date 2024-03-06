import java.util.Scanner;
public class RrvrrseInteger {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input integer from the user
	        System.out.println("Enter an integer:");
	        int inputNumber = scanner.nextInt();

	        // Reverse the order of digits
	        int reversedNumber = reverseInteger(inputNumber);

	        // Display the result
	        System.out.println("Reversed Integer: " + reversedNumber);

	        scanner.close();
	    }

	    // Method to reverse the order of digits in an integer
	    private static int reverseInteger(int number) {
	        int reversed = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }

	        return reversed;
	    }
	

}
