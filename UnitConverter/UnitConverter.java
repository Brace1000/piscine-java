public class UnitConverter {
    public static String convert(String[] args) {
        // Check if we have exactly 3 arguments
        if (args == null || args.length != 3) {
            return "ERROR";
        }
        
        try {
            String fromUnit = args[0].toLowerCase();
            String toUnit = args[1].toLowerCase();
            double value = Double.parseDouble(args[2]);
            
            double result;
            
            // Handle different conversion types
            switch (fromUnit + "_to_" + toUnit) {
                case "celsius_to_fahrenheit":
                    result = value * 9.0 / 5.0 + 32;
                    break;
                case "fahrenheit_to_celsius":
                    result = (value - 32) * 5.0 / 9.0;
                    break;
                case "kilometers_to_miles":
                    result = value * 0.621371;
                    break;
                case "miles_to_kilometers":
                    result = value * 1.60934;
                    break;
                case "pounds_to_kilograms":
                    result = value * 0.45359237;
                    break;
                default:
                    return "ERROR";
            }
            
            // Format to 2 decimal places
            return String.format("%.2f", result);
            
        } catch (NumberFormatException e) {
            return "ERROR";
        } catch (Exception e) {
            return "ERROR";
        }
    }
}