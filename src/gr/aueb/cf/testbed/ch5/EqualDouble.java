package gr.aueb.cf.testbed.ch5;

public class EqualDouble {

    public static void main(String[] args) {
        double d1 = 0.9995; // 0.9996
        double d2 = 1.0001;
        final double EPSILON = 0.005;   // 0.0005

        if (Math.abs(d2 - d1) <= EPSILON) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
