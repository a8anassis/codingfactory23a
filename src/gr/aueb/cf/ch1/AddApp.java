package gr.aueb.cf.ch1;

/**
 * Adds two integers.
 *
 * @author a8ana
 */
public class AddApp {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 7;
        int result = 0;

        // Εντολές
        result = num1 + num2;


        System.out.println("Το αποτέλεσμα των " + num1 + ",  " + num2 + " είναι " + result);
        System.out.printf("Το αποτέλεσμα των %d , %d είναι %d", num1, num2, result);
    }
}
