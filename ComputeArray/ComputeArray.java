public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        
        int[] result = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            
            if (current % 3 == 0) {
                // Multiple of 3: multiply by 5
                result[i] = current * 5;
            } else if (current % 3 == 1) {
                // Multiple of 3 + 1: increment by 7
                result[i] = current + 7;
            } else {
                // Multiple of 3 + 2: stay unchanged
                result[i] = current;
            }
        }
        
        return result;
    }
}