public class LogLine {

    private String logLine;
    private LogLevel logLevel;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String value = logLine.substring(1, logLine.indexOf("]"));
        switch (value) {
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
        this.logLevel = getLogLevel();
        return logLevel.getLevel() + ":" + logLine.substring(7, logLine.length());
    }
}
class test {
    public static void main(String[] args) {
        /*LogLine logLine = new LogLine("[ERR]: File deleted");
        System.out.println(logLine.getLogLevel());*/
        LogLine logLine = new LogLine("[ERR]: Stack Overflow");
        System.out.println(logLine.getOutputForShortLog());
        
    }
}
