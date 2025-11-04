import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // 1. Validate arguments
        if (args == null || args.length != 2) {
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Modify this section to handle spaces
                
                // 1. Trim leading and trailing spaces
                String trimmedLine = line.trim();
                
                // 2. Replace multiple spaces between words with a single space
                //    Using a regex "\\s+" matches one or more whitespace characters
                String singleSpacedLine = trimmedLine.replaceAll("\\s+", " ");
                
                // 3. Capitalize the entire line
                String capitalizedLine = singleSpacedLine.toUpperCase();
                
                writer.write(capitalizedLine);
                writer.newLine(); 
            }
        }
    }
}