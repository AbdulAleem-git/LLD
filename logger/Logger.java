public abstract class Logger {
    public static int INFO = 0;
    public static int DEBUG = 1;
    public static int ERROR = 2;

    public Logger nextLogger ;

    Logger(Logger logger){
        this.nextLogger = logger;
    }

    public void log(int loglevel , String message){
        if (nextLogger != null){
            nextLogger.log(loglevel, message);
        }
    }
}
