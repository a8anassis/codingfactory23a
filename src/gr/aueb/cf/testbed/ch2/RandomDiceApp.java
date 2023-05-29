package gr.aueb.cf.testbed.ch2;

/**
 * Ρίχνει μία τυχαία ζαριά με δύο ζάρια
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die1: %d, Die2: %d", die1, die2);
    }
}
