import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            // Exception 1: null or empty check
            if (sentence == null || sentence.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Input cannot be null or empty.");
            }

            String[] words = sentence.trim().split("\\s+");

            // Exception 2: less than two words
            if (words.length < 2) {
                throw new IllegalArgumentException("Error: Sentence must contain at least two words.");
            }

            // ---- Sentence operations ----
            // 1. Convert to uppercase
            String upper = sentence.toUpperCase();

            // 2. Reverse word order
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }

            // Output result
            System.out.println("\nOriginal Sentence: " + sentence);
            System.out.println("Uppercase: " + upper);
            System.out.println("Reversed Word Order: " + reversed.toString().trim());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
