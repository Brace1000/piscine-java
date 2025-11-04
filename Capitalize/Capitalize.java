import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args == null || args.length < 2 || args[0] == null || args[1] == null) {
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args[1];
        
        File input = new File(inputFile);
        if (!input.exists() || !input.isFile()) {
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            boolean firstLine = true;
            
            while ((line = reader.readLine()) != null) {
                // Don't add newline before the first line
                if (!firstLine) {
                    writer.newLine();
                }
                
                // Process the current line
                if (line.isEmpty()) {
                    writer.write("");
                } else {
                    // Convert the line to character array for precise control
                    char[] chars = line.toCharArray();
                    boolean capitalized = false;
                    
                    for (int i = 0; i < chars.length; i++) {
                        // Find first alphabetic character and capitalize it
                        if (!capitalized && Character.isLetter(chars[i])) {
                            chars[i] = Character.toUpperCase(chars[i]);
                            capitalized = true;
                        }
                    }
                    
                    writer.write(chars);
                }
                
                firstLine = false;
            }
            
            // Ensure the output is flushed
            writer.flush();
        }
    }
}