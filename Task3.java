import java.util.Scanner;

public class Task3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // First number
            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine();

            if (input1 == null || input1.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: First number cannot be empty.");
            }

            double num1;
            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Error: First input is not a valid number.");
            }

            // Second number
            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine();

            if (input2 == null || input2.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Second number cannot be empty.");
            }

            double num2;
            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Error: Second input is not a valid number.");
            }

            // Operation
            System.out.print("Enter operation (+, -, *, /): ");
            String operation = scanner.nextLine();

            double result;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;

                default:
                    throw new IllegalArgumentException("Error: Invalid operation selected.");
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

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