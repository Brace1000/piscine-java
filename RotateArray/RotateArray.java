public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        int n = arr.length;
        // Handle negative rotation by converting to equivalent positive rotation
        int k = rotationCount % n;
        if (k < 0) {
            k += n; // Convert negative rotation to positive equivalent
        }
        
        // If no rotation needed after normalization
        if (k == 0) {
            return arr.clone();
        }
        
        Integer[] rotated = new Integer[n];
        
        // Perform the rotation
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        
        return rotated;
    }
}