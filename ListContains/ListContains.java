import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        // Iterate through the list and check if any element equals the value
        for (Integer element : list) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}