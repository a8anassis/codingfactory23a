package gr.aueb.cf.testbed.ch5;

/**
 * Υπολογίζει το a^n με αναδρομή.
 */
public class PowerRecursive {

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

    public static float power(float a, float b) {
        if (b < 0) {
            return 1 / power(a, -b);
        }

        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }
}
