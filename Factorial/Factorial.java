public class Factorial {
    public static Integer factorial(Integer n) {
        // Handle negative input
        if (n < 0) {
            return null;
        }
        
        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }
        
        // Calculate factorial iteratively
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}