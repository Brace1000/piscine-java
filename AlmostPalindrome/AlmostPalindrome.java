public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        String lowerCaseString = s.toLowerCase();
        int left = 0;
        int right = lowerCaseString.length() - 1;

        while (left < right) {
            if (lowerCaseString.charAt(left) != lowerCaseString.charAt(right)) {
                // Found a mismatch, check if removing one character makes it palindrome
                return checkSubstring(lowerCaseString, left + 1, right) ||
                       checkSubstring(lowerCaseString, left, right - 1);
            }
            left++;
            right--;
        }

        // If no mismatches found, it's a perfect palindrome (not "almost")
        return false;
    }

    private static boolean checkSubstring(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

   
}
