package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 * Βρίσκει τον μέγιστο τριών ακεραίων
 * που δίνει ο χρήστης.
 */
public class MaxOfThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three nums to find the max");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf("Max between %d, %d, %d is %d",
                num1, num2, num3, Math.max(num1, Math.max(num2, num3)));
    }
}
