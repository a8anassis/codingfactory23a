package gr.aueb.cf.testbed.ch3;

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        boolean bingo = false;
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int KEY = 10;

        do {
            System.out.println("Please give an int");
            num = in.nextInt();
            if (num != KEY) {
                System.out.println("Try Again");
                continue;
            }
            System.out.println("Bingo!");
            bingo = true;
        } while (!bingo);
    }
}
