package gr.aueb.cf.testbed.ch4;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Λάθος επιλογή");
            }

            if (choice == 5) {
                System.out.println("You selected Exit ...");
            }

            if (choice == 1) {
                System.out.println("Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Ενημέρωση");
            } else {
                System.out.println("Αναζήτηση");
            }
        } while (choice != 5);
    }
}
