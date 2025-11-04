import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // 1. Validate arguments
        if (args == null || args.length != 2) {
            // As per previous exercises, an invalid number of arguments usually results in an error
            // or simply doing nothing, depending on exact test expectations.
            // For file operations, it's safer to just return or throw a specific exception.
            return; 
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        // Use try-with-resources for both reader and writer to ensure they are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            // 2. Read file line by line
            while ((line = reader.readLine()) != null) {
                // 3. Capitalize each line
                // String.toUpperCase() converts all characters in the string to uppercase.
                String capitalizedLine = line.toUpperCase();
                
                // 4. Write capitalized line to output file
                writer.write(capitalizedLine);
                writer.newLine(); // Add a new line character after each line, similar to readLine() behavior
            }
        }
        // No explicit catch here because the function signature "throws IOException"
        // means any IOException will be thrown up to the caller (ExerciseRunner),
        // which matches common patterns for these exercises.
    }
}