public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as reference
        String first = strs[0];
        
        for (int i = 0; i < first.length(); i++) {
            char currentChar = first.charAt(i);
            
            // Check this character in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If current string is shorter or character doesn't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return first.substring(0, i);
                }
            }
        }
        
        // All strings match the first string completely
        return first;
    }
}