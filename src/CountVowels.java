import java.util.Scanner;
public class CountVowels {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Call the method to count vowels
        int vowelCount = countVowels(sentence);

        // Display the result
        System.out.println("Number of vowels in the sentence: " + vowelCount);
        
        scanner.close();
    }

    // Method to count vowels in a sentence
    private static int countVowels(String str) {
        // Convert the sentence to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

	
	

}
