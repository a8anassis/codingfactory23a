package gr.aueb.cf.testbed.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει και εμφανίζει το άθροισμα των
 * ψηφίων ενός ακεραίου.
 */
public class DigitsOfNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int rightDigit = 0;
        int rightmostDigit = 0;
        int leftmostDigit = 0;
        int sum = 0;
        int count = 0;
        int currentDigit = 0;
        int sumOfLeftRightDigits = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();
        num = inputNum;
        do {
            count++;
            rightDigit = num % 10;
            currentDigit = rightDigit;
            sum += rightDigit;
            if (count == 1) rightmostDigit = rightDigit;
            num = num / 10;
        } while (num != 0);
        leftmostDigit = currentDigit;
        sumOfLeftRightDigits = rightmostDigit + leftmostDigit;

        System.out.println("Sum of Digit: "  + sum);
        System.out.println("Count of Digits: " + count);
        System.out.println("Rightmost Digit: " + rightmostDigit);
        System.out.println("Leftmost Digit: " + leftmostDigit);
        System.out.println("Sum of start - end digits: " + sumOfLeftRightDigits);
    }
}
