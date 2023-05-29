package gr.aueb.cf.testbed.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών, λαμβάνει τιμή
 * από τον χρήστη, λαμβάνει δύο τιμές και εμφανίζει
 * το αποτέλεσμα.
 */
public class MenuApp {
    // Class global scoping
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 0;
        int choice = 0;

        do {
             printMenu();
             choice = getNextInt("Please insert your choice");
             if (isChoiceInvalid(choice)) {
                 System.out.println("Invalid choice");
                 continue;
             }
             if (isChoiceQuit(choice)) {
                 System.out.println("Thanks for using the app..");
                 break;
             }
             result = onChoiceGetResult(choice);
             System.out.println("Result: " + result);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο (Modulus)");
        System.out.println("6. Έξοδος");
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {

        return choice == 6;
    }

    public static int getNextInt(String s) {
        System.out.println(s);
        return in.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            return Integer.MAX_VALUE;
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            return Integer.MAX_VALUE;
        }
        return a % b;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first int");
        int num2 = getNextInt("Please insert the second int");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                break;
        }

        return result;
    }
}
