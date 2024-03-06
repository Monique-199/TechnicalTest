
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Capitalize the first letter of each word
        String capitalizedString = capitalizeWords(inputString);

        // Display the result
        System.out.println("Capitalized String: " + capitalizedString);

        scanner.close();
    }

    // Method to capitalize the first letter of each word in a string
    private static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Split the input into words
        String[] words = input.split("\\s");

        // Capitalize the first letter of each word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        // Remove space and return the result
        return result.toString().trim();
    }
}

