package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        /**
         * Αρχικά εισάγω κλάση Scanner μιας και
         *έχω ανάγκη να εισαχθούν δεδομένα απο χρήστη.
         */
        Scanner in = new Scanner(System.in);
        int inputFahrenheit = 0;
        int celsius = 0;
        final int CONVERSION_RATE = 5 * (inputFahrenheit - 32) / 9;

        //Εντολές
        /**
         *Προτροπή προς τον χρήστη να εισάγει μια ακέραιη τιμή.
         */
        System.out.println("Please insert a temperature in Fahrenheit");
        inputFahrenheit = in.nextInt();
        celsius = CONVERSION_RATE;


        //Εκτύπωση
        System.out.printf(" %d Fahrenheit = %,d Celsius", inputFahrenheit, celsius);
    }
}
