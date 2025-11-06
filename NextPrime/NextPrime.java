public class NextPrime {
    public static Integer nextPrime(Integer n) {
        if (n == null) {
            return null;
        }
        
        // Start checking from n+1
        int candidate = n + 1;
        
        // Keep checking until we find a prime number
        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }
    
    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        
        // Check divisibility up to sqrt(number)
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}