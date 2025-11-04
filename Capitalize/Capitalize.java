import java.io.*;
import java.nio.file.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args == null || args.length < 2) {
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args[1];
        
        try {
            // Read all bytes to preserve exact formatting
            byte[] bytes = Files.readAllBytes(Paths.get(inputFile));
            String content = new String(bytes);
            
            // Split while keeping trailing empty lines
            String[] lines = content.split("\n", -1);
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < lines.length; i++) {
                if (i > 0) {
                    result.append("\n");
                }
                
                String line = lines[i];
                if (!line.isEmpty()) {
                    // Find first alphabetic character
                    boolean capitalized = false;
                    StringBuilder lineBuilder = new StringBuilder();
                    
                    for (char c : line.toCharArray()) {
                        if (!capitalized && Character.isAlphabetic(c)) {
                            lineBuilder.append(Character.toUpperCase(c));
                            capitalized = true;
                        } else {
                            lineBuilder.append(c);
                        }
                    }
                    result.append(lineBuilder);
                } else {
                    result.append("");
                }
            }
            
            // Write with exact same line endings as input
            Files.write(Paths.get(outputFile), result.toString().getBytes());
            
        } catch (NoSuchFileException e) {
            return;
        } catch (IOException e) {
            return;
        }
    }
}