
public class FibonacciSequence {
	public static void main(String[] args) {
        int maxLimit = 100;

        // Generate Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + maxLimit + ":");
        generateFibonacci(maxLimit);
    }

    // Method to generate Fibonacci sequence up to a given limit
    private static void generateFibonacci(int limit) {
        int num1 = 0, num2 = 1;

        while (num1 <= limit) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

}
