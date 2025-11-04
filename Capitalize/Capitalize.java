import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        
        // Read entire file content
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));
        
        // Split by newlines while preserving empty lines
        String[] lines = content.split("\n", -1);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < lines.length; i++) {
                if (i > 0) {
                    writer.newLine();
                }
                
                String line = lines[i];
                if (!line.isEmpty()) {
                    // Find first letter and capitalize it
                    for (int j = 0; j < line.length(); j++) {
                        if (Character.isLetter(line.charAt(j))) {
                            String before = line.substring(0, j);
                            String firstLetter = String.valueOf(Character.toUpperCase(line.charAt(j)));
                            String after = line.substring(j + 1);
                            writer.write(before + firstLetter + after);
                            break;
                        }
                        // If no letter found, write line as-is
                        if (j == line.length() - 1) {
                            writer.write(line);
                        }
                    }
                } else {
                    writer.write("");
                }
            }
        }
    }
}