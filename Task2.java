import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            //  Check null or empty input
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Input is null or empty.");
            }

            //  Convert string to integer
            int n = Integer.parseInt(input.trim());

            //  Check negative input
            if (n < 0) {
                throw new IllegalArgumentException("Error: Factorial is not defined for negative numbers.");
            }

            //  Calculate factorial with overflow check
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;

                // overflow detection (basic check)
                if (factorial < 0) {
                    throw new ArithmeticException("Error: Integer overflow occurred while calculating factorial.");
                }
            }

            System.out.println("Factorial of " + n + " is: " + factorial);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}