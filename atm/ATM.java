public abstract class ATM{
    public static int FIVEHUNDREDS = 500;
    public static int TWOHUNDREDS = 200;
    public static int HUNDREDS = 100;
    public static int THOUSAND = 1000;
    public static int TWOTHOUSANDS = 2000;

    ATM NextAtmHandler;

    ATM(ATM NextAtmHandler){
        this.NextAtmHandler = NextAtmHandler;
    }

    public void doTransact(int NoteValue, int amount){
        if(NextAtmHandler != null){
            //To DO: put more check on balance available

            NextAtmHandler.doTransact(NoteValue, amount);
        }
    }


}