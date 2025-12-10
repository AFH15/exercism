public class LogLevels {
    private static final String regex = "(?<=\\[)|(?=\\])|(?=:)|(?<=:)";
        //[                  0
        //ERROR              1
        //]                  2
        //:                  3
        //Invalid Operation  4
    
    public static String message(String logLine) {
        String[] strArray = logLine.split(regex);
        return strArray[4].trim();
    }

    public static String logLevel(String logLine) {
        String[] strArray = logLine.split(regex);
        return strArray[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] strArray = logLine.split(regex);
        return strArray[4].trim() + " (" + strArray[1].toLowerCase() + ")";
    }
}
