public class CleanExtract {
    public static String extract(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        // Split the string by | character
        String[] substrings = s.split("\\|", -1);
        StringBuilder result = new StringBuilder();
        
        for (String substring : substrings) {
            // Find the first dot and last dot in the substring
            int firstDot = substring.indexOf('.');
            int lastDot = substring.lastIndexOf('.');
            
            // Check if we have valid dots (different positions)
            if (firstDot != -1 && lastDot != -1 && firstDot != lastDot) {
                // Extract the portion between first and last dot
                String extracted = substring.substring(firstDot + 1, lastDot);
                // Trim whitespace
                extracted = extracted.trim();
                // Only add non-empty strings
                if (!extracted.isEmpty()) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(extracted);
                }
            }
        }
        
        return result.toString();
    }
}