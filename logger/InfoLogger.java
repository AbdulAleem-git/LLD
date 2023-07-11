public class InfoLogger extends Logger {
   
    InfoLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(int loglevel, String msg ) {
        if(loglevel == INFO){
            System.out.println(INFO + ":" + msg);
        }else{
           super.log(loglevel, msg); 
        }
    }
}
