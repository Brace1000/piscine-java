public class CleanExtract {
    public static String extract(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        String[] substrings = s.split("\\|", -1);
        StringBuilder result = new StringBuilder();
        
        for (String substring : substrings) {
            String processed = processSubstring(substring.trim());
            if (!processed.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(processed);
            }
        }
        
        return result.toString();
    }
    
    private static String processSubstring(String substring) {
        if (substring.isEmpty()) {
            return "";
        }
        
        int firstDot = substring.indexOf('.');
        int lastDot = substring.lastIndexOf('.');
        
        // If no dots, use the whole string
        if (firstDot == -1) {
            return substring;
        }
        
        // If only one dot
        if (firstDot == lastDot) {
            // Extract from after the dot to the end
            return substring.substring(firstDot + 1).trim();
        }
        
        // Multiple dots - extract between first and last
        return substring.substring(firstDot + 1, lastDot).trim();
    }
}