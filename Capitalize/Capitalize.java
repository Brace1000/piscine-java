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
                
                // Capitalize the first character of each line
                if (!line.isEmpty()) {
                    String capitalizedLine = Character.toUpperCase(line.charAt(0)) + line.substring(1);
                    writer.write(capitalizedLine);
                } else {
                    writer.write(""); // Write empty line as is
                }
                
                firstLine = false;
            }
        }
    }
}