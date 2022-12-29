import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    private int min = 1;
    private int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int totalsum = 0;
        int diceUsed = 0;
        while (diceUsed < diceCount) {
            totalsum += ThreadLocalRandom.current().nextInt(min, max + 1);
            diceUsed++;
        }
        return totalsum;
    }

}
