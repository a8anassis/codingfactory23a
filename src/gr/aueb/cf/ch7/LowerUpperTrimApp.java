package gr.aueb.cf.ch7;

import gr.aueb.cf.testbed.ch7.Str;

/**
 * Transforms strings.
 */
public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "  Athens Uni   ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "  ";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed =  s.trim();

        System.out.println("*".repeat(10));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }

        if (s2.isBlank()) {
            System.out.println("Blank");
        }
    }
}
