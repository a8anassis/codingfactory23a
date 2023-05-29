package gr.aueb.cf.testbed.ch7;

public class Str {

    public static void main(String[] args) {
        String s = "Coding";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.print("\u2764");
    }
}
