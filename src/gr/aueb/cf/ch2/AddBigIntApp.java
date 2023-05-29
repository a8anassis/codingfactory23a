package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Demonstrates BigInteger class.
 */
public class AddBigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("21474836478484848484");
        BigInteger bigNum2 = new BigInteger("21474836479393838383");
        BigInteger result = new BigInteger("0");

        result = bigNum.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
