import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args[1];
        
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        
        String line;
        boolean firstLine = true;
        
        while ((line = reader.readLine()) != null) {
            if (!firstLine) {
                writer.newLine();
            }
            firstLine = false;
            
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true;
            
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                
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
            
            writer.write(result.toString());
        }
        
        reader.close();
        writer.close();
    }
}