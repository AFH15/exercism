public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int LOG_LEVEL;

    LogLevel (int logLevel){
        this.LOG_LEVEL = logLevel;
    }

    public int getNumber (){
        return LOG_LEVEL;
    }
    
}
