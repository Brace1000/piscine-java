public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        
        Integer[] reversed = new Integer[arr.length];
        
        // Copy elements in reverse order
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        
        return reversed;
    }
}