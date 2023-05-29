package gr.aueb.cf.testbed.ch4;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα έτος είναι Δίσεκτο (Leap).
 * Δίσεκτο είναι ένα έτος αν διαιρείται
 * με το 4 και όχι με το 100.
 * Αν όμως διαιρείται με το 100 τότε
 * δίσεκτο είναι αν διαιρείται με το
 * 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;

        System.out.println("Please insert a year (int)");
        year = in.nextInt();

        isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else if (year % 400 == 0) {
                    isLeapYear = true;
            }
        }
    }
}

