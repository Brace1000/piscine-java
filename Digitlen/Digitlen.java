public class Digitlen {
    public static int digitlen(long number) {
        // Handle the special case of 0
        if (number == 0) {
            return 1;
        }
        
        // Handle negative numbers by converting to positive
        long num = Math.abs(number);
        int count = 0;
        
        // Count digits by repeatedly dividing by 10
        while (num > 0) {
            count++;
            num /= 10;
        }
        
        return count;
    }
}