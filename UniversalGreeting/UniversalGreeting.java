public class UniversalGreeting {
    public static String greeting(String language) {
        if (language == null) {
            return "";
        }
        
        String lang = language.toUpperCase();
        
        if (lang.equals("FR")) {
            return "Bonjour comment allez-vous?";
        } else if (lang.equals("EN")) {
            return "Hello, How are you?";
        } else if (lang.equals("ES")) {
            return "Hola, cómo estás?";
        } else {
            return "";
        }
    }
}