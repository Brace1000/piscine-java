public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        
        // Convert the string to lowercase for case-insensitive comparison
        String lowerCaseString = s.toLowerCase();
        int left = 0;
        int right = lowerCaseString.length() - 1;
        
        while (left < right) {
            if (lowerCaseString.charAt(left) != lowerCaseString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}