public class MultiplicationTable {
    public static void generate(int num) {
        // Generate multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
    
}