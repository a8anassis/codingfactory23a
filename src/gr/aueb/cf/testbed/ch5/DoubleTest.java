package gr.aueb.cf.testbed.ch5;

public class DoubleTest {

    public static void main(String[] args) {
        double d = 0.0;
        double mod = 0;

        d = 100000000000000.0 / 3;
        mod = 10000.0 % 3;
        System.out.printf("%g\n", d);
        System.out.printf("%.2g", mod);
    }
}
