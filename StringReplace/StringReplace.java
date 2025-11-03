public class StringReplace {
    public static String replace(String s, Object target, Object replacement) {
        if (s == null) {
            return null;
        }
        
        if (target == null || replacement == null) {
            return s;
        }
        
        // Handle char parameters
        if (target instanceof Character && replacement instanceof Character) {
            char targetChar = (Character) target;
            char replacementChar = (Character) replacement;
            return s.replace(targetChar, replacementChar);
        }
        
        // Handle String parameters
        if (target instanceof String && replacement instanceof String) {
            String targetStr = (String) target;
            String replacementStr = (String) replacement;
            return s.replace(targetStr, replacementStr);
        }
        
        // If types don't match or are invalid, return original string
        return s;
    }
}