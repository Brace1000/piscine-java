public class ArmstrongNumber {
    public boolean isArmstrong(int number) {
        if (number < 0) {
            return false; // Armstrong numbers are typically defined for non-negative integers
        }
        
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = countDigits(number);
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    private int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
      
}