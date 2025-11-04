import java.util.Arrays;
public class SortArgs {
    public static void sort(String[] args) {
        if (args==null || args.length==0){
            System.out.println();
            return;
        }
        //convert String array to int Array
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        
        }
        //sort the array
        Arrays.sort(numbers);
        //print the sorted array with spaces and new line at the end
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] );
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        
        }
        System.out.println();

    }
}
