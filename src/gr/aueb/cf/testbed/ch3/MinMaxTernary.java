package gr.aueb.cf.testbed.ch3;

import java.util.Map;
import java.util.Scanner;

public class MinMaxTernary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 0, abs = 0;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = (num1 < num2) ? num1 : (num1 > num2) ? num2 : 0;
        //min = Math.min(num1, num2);
        abs = (num1 > 0) ? num1 : -num1;
    }
}
