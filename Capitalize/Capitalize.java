import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args == null || args.length != 2) {
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // --- DEBUGGING OUTPUT START ---
                System.err.println("Original Line: '" + line + "'"); // Using System.err so it stands out
                // --- DEBUGGING OUTPUT END ---

                String trimmedLine = line.trim();
                System.err.println("Trimmed Line: '" + trimmedLine + "'"); // DEBUG

                String singleSpacedLine = trimmedLine.replaceAll("\\s+", " ");
                System.err.println("Single Spaced Line: '" + singleSpacedLine + "'"); // DEBUG

                String capitalizedLine = singleSpacedLine.toUpperCase();
                System.err.println("Final Capitalized Line: '" + capitalizedLine + "'"); // DEBUG
                
                writer.write(capitalizedLine);
                writer.newLine();
            }
        }
    }
}