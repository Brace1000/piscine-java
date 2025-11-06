public class CountChar {
    public static int count(String s, char c) {
        if (s == null) {
            return 0;
        }
        
        int count = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        
        return count;
    }
}