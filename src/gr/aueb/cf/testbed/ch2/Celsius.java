package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        System.out.println("Please insert temp in fahrenheit");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u00B0F = %d\u00B0C", fahrenheit, celsius);
    }
}
