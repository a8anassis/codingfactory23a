package gr.aueb.cf.ch5;

/**
 * Float / Double Expressions
 */
public class Expression {

    public static void main(String[] args) {
        double num1 = 12345678.5;
        double num2 = 2.0;
        double result;
        double mod;

        result = num1 / num2;   // 6,25
        mod = num1 % num2;      // 0,5

        System.out.printf("%,.2f / %.2g = %,016.2g\n", num1, num2, result);
        System.out.printf("%.2f %% %.2f = %.2f", num1, num2, mod);
    }
}
