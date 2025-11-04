public class DoOp {
    public static String operate(String[] args) {
        if (args == null || args.length != 3) {
            return "Error";
        }
        try {
            //parse the operands
            int left = Integer.parseInt(args[0]);
            int right = Integer.parseInt(args[2]);
            String operator = args[1];
            //perform the operation based on the operator
            switch(operator) {
                case"+":
                return String.valueOf(left + right);
                case"-":
                return  String.valueOf(left-right);
                case"*":
                return String.valueOf(left*right);
                case"/":
                if (right == 0){
                    return "Error";

                }
                return String.valueOf(left / right);
                case "%":
                if (right == 0){
                    return "Error";
                }
                return String.valueOf(left % right);
                default:
                return "Error";
            
            }
        } catch(NumberFormatException e) {
            return "Error";
        } 
    }
}