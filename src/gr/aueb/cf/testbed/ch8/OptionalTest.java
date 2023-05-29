package gr.aueb.cf.testbed.ch8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        String s = "AUEB";
        String copied = null;
        Optional<String> str = getCopy(s);

        if (str.isPresent()) {
            copied = str.get();
        }

        System.out.println(copied);
        str.ifPresent(System.out::println);
    }


    public static Optional<String> getCopy(String s) {
       return Optional.ofNullable(s);
    }
}
