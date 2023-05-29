package gr.aueb.cf.testbed.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Reads bigint and display stars
 */
public class StarsBigInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strBigNum;
        BigInteger bigNum;

        System.out.println("Please insert big num");
        strBigNum = in.next();
        bigNum = new BigInteger(strBigNum);

        for (BigInteger i = BigInteger.ONE; i.compareTo(bigNum) <= 0 ; i = i.add(BigInteger.ONE)) {
            System.out.print("*");
        }
        System.out.println("Thanks for using stars utility!");
    }
}
