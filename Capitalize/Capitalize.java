import java.io.*;
import java.nio.file.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args[1];
        
        // Read entire file content
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));
        
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            
            if (Character.isLetter(c)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                result.append(c);
                capitalizeNext = true;
            }
        }
        
        // Write to output file
        Files.write(Paths.get(outputFile), result.toString().getBytes());
    }
}