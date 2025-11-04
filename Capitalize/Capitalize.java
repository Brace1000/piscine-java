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
                // This is the original simple capitalization logic
                String capitalizedLine = line.toUpperCase();
                
                writer.write(capitalizedLine);
                writer.newLine(); 
            }
        }
    }
}