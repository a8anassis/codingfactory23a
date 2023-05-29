package gr.aueb.cf.testbed.ch5;

public class FloatDoubleApp {

    public static void main(String[] args) {
        float f = 1.2F;
        double d = 312345678.41234;

        System.out.printf("%f\n", d);
        System.out.printf("%.4f\n", d);
        System.out.printf("%,016.2f\n", d);
    }
}
