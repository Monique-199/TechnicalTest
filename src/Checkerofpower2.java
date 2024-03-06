import java.util.Scanner;
public class Checkerofpower2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integer from the user
        System.out.println("Enter an integer:");
        int input = scanner.nextInt();

        // Check if the input is a power of 2
        boolean isPowerOfTwo = checkPowerOfTwo(input);

        // Display the result
        System.out.println(input + " is a power of 2: " + isPowerOfTwo);

        scanner.close();
    }

    // Method to check if an integer is a power of 2
    private static boolean checkPowerOfTwo(int num) {
       
        return (num > 0) && ((num & (num - 1)) == 0);
    }

}
