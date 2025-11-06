public class SystemLog {
    public static String systemLog(String message) {
        if (message == null) {
            return "System Log: null";
        }
        return "System Log: " + message;
    }
}