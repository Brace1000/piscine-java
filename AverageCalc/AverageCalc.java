public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step <= 0 || start > end) {
            return 0; // Invalid input
        }
        
        int sum = 0;
        int count = 0;
        
        // Generate the sequence and calculate sum
        for (int i = start; i <= end; i += step) {
            sum += i;
            count++;
        }
        
        // Calculate average (integer division)
        return sum / count;
    }
  
}