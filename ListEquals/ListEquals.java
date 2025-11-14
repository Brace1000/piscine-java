import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        // Check if lists have the same size
        if (list1.size() != list2.size()) {
            return false;
        }
        
        // Check each element at the same position
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        
        return true;
    }
}