import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // Check if both input and output filenames are provided
        if (args == null || args.length < 2 || args[0] == null || args[1] == null) {
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args[1];
        
        File input = new File(inputFile);
        
        // Check if input file exists and is a file
        if (!input.exists() || !input.isFile()) {
            return;
        }
        
        // Use try-with-resources to automatically close the streams
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            boolean firstLine = true;
            
            // Read each line from input file
            while ((line = reader.readLine()) != null) {
                if (!firstLine) {
                    writer.newLine(); // Add newline between lines (but not at the end)
                }
                
                // Handle empty lines
                if (line.isEmpty()) {
                    writer.write("");
                } else {
                    // Find the first non-whitespace character
                    int firstNonSpace = 0;
                    while (firstNonSpace < line.length() && Character.isWhitespace(line.charAt(firstNonSpace))) {
                        firstNonSpace++;
                    }
                    
                    if (firstNonSpace < line.length()) {
                        // Preserve leading spaces and capitalize first non-space character
                        String leadingSpaces = line.substring(0, firstNonSpace);
                        char firstChar = Character.toUpperCase(line.charAt(firstNonSpace));
                        String restOfLine = line.substring(firstNonSpace + 1);
                        writer.write(leadingSpaces + firstChar + restOfLine);
                    } else {
                        // Line contains only whitespace
                        writer.write(line);
                    }
                }
                
                firstLine = false;
            }
        }
    }
}