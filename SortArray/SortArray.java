import java.util.Arrays;

public class SortArray {
    public static Integer[] sort(Integer[] args) {
        if (args == null) {
            return null;
        }
        
        // Create a copy to avoid modifying the original array
        Integer[] sorted = args.clone();
        
        // Use Arrays.sort() for efficient sorting
        Arrays.sort(sorted);
        
        return sorted;
    }
}