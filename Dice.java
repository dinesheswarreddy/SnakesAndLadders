import java.util.Random;

class Dice {
    private int diceCount;
    private Random random;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
        this.random = new Random();
    }

    public int roll() {
        int total = 0;
        for (int count = 0; count < diceCount; count++) {
            total += random.nextInt(6) + 1;
        }
        return total;
    }
}
