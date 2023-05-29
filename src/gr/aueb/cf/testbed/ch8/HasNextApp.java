package gr.aueb.cf.testbed.ch8;

import java.util.Scanner;

public class HasNextApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Insert");
            if (in.hasNextInt()) {
                num = in.nextInt();
                if (num == 12) break;
            }

        }
    }
}
