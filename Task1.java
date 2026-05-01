import java.util.List;

public class Task1 {

    public static void calculateAverage(List<String> numbers) {
        try {
            // Check for null or empty list
            if (numbers == null || numbers.isEmpty()) {
                throw new IllegalArgumentException("Error: The list is null or empty.");
            }

            int sum = 0;
            int count = 0;

            for (String value : numbers) {
                try {
                    // Try to parse each element to integer
                    int num = Integer.parseInt(value);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    // Skip invalid integers and show message
                    System.out.println("Skipping invalid value: " + value);
                }
            }

            // If no valid integers found
            if (count == 0) {
                System.out.println("Error: The list contains only invalid (non-numeric) values.");
                return;
            }

            double average = (double) sum / count;
            System.out.println("Average of valid numbers: " + average);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        List<String> testList = List.of("10", "20", "abc", "30", "xyz");

        calculateAverage(testList);
    }
}