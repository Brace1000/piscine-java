import java.util.Arrays; // Import the Arrays class for sorting

public class SortArgs {
    public static void sort(String[] args) {
        // Handle null or empty input array defensively
        if (args == null || args.length == 0) {
            System.out.println(); // Print a newline if the array is empty or null, as per common interpretation for "empty array output".
            return;
        }

        // 1. Convert String array to int array
        int[] numbers = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            // According to instructions, "All the given elements are valid numbers."
            // So, this catch block should ideally not be reached by the tests.
            // If it were a real-world scenario, you might print an error or handle it differently.
            // For now, we'll assume valid input as per problem.
            return; // Exit if invalid number, though tests should prevent this
        }

        // 2. Sort the int array
        Arrays.sort(numbers); // This sorts the array in ascending order

        // 3. Print the sorted array to standard output
        // Elements separated by spaces, followed by a newline character.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" "); // Add a space if it's not the last element
            }
        }
        System.out.println(); // Add a final newline character
    }
}