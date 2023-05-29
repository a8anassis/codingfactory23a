package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει ισότητα / ανισότητα στους
 * floating points.
 */
public class DoubleCompareApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d1;
        double d2;
        final double EPSILON = 0.000005;

        System.out.println("Please insert two doubles");
        d1 = in.nextDouble();
        d2 = in.nextDouble();

        if (Math.abs(d2 - d1) <= EPSILON) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT Equal");
        }
    }
}
