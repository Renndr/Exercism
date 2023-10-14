public class LogLevels {
         
    public static String message(String logLine) {   
        logLine = logLine.split(":")[1];               
        return logLine.trim();        
    }
    
    public static String logLevel(String logLine) {
        logLine = logLine.split("]: ")[0];
        return logLine.substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return String.format("%s (%s)", message, level);
    }

}