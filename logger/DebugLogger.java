public class DebugLogger extends Logger {
    DebugLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(int loglevel, String msg ) {
        if(loglevel == DEBUG){
            System.out.println(DEBUG + ":" + msg);
        }else{
           super.log(loglevel, msg); 
        }
    }
}
