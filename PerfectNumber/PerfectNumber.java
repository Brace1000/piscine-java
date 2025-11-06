public class PerfectNumber {
    public boolean isPerfectNumber(int number) {
        // Perfect numbers must be positive integers greater than 1
        if (number <= 1) {
            return false;
        }
        
        int sum = 0;
        
        // Iterate through all possible divisors up to number/2
        for (int i = 1; i <= number / 2; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }
        
        // Check if sum of divisors equals the original number
        return sum == number;
    }
}