class Main{
    public static void main(String[] args) {
        Logger log = new InfoLogger(new ErrorLogger(new DebugLogger(null)));

        log.log(Logger.INFO, "Your pod successfully updated");
        log.log(Logger.DEBUG, "connection is created");
        log.log(Logger.ERROR, "Wrong password error");
    }
}