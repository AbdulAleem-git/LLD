public class ErrorLogger extends Logger {
    ErrorLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(int loglevel, String msg ) {
        if(loglevel == ERROR){
            System.out.println(ERROR + ":" + msg);
        }else{
           super.log(loglevel, msg); 
        }
    }
}
