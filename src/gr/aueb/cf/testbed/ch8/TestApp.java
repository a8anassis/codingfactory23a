package gr.aueb.cf.testbed.ch8;

import java.io.IOException;

public class TestApp {

    public static void main(String[] args) throws IOException {
        try {
            int ch = getNextByte();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    private static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Your choice is not valid. Please enter a choice from the options 1 - 5.");
        }
    }

    public static int getNextByte() throws IOException {
        int ch = ' ';
        try {
            ch = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

        return ch;
    }
}
