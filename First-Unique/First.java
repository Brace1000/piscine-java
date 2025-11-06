public class First-Unique {
    public char findFirstUnique(String s) {
        if (s == null || s.isEmpty()) {
            return '_';
        }
        
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // First pass: count character occurrences
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        
        // Second pass: find first character with count 1
        for (char c : s.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        
        return '_';
    }
}