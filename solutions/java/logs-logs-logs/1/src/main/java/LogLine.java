public class LogLine {
    private String[] strArray;
    private final String regex = "(?<=\\[)|(?=\\])|(?=:)|(?<=:)";
    //[,INF,],:,File deleted
    
    public LogLine(String logLine) {
        strArray = logLine.split(regex);
    }

    public LogLevel getLogLevel() {
        switch (strArray[1]){
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        return getLogLevel().getNumber() + ":" + strArray[4].trim();
    }
}
