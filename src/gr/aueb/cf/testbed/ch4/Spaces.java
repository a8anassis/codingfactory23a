package gr.aueb.cf.testbed.ch4;

import java.io.IOException;

public class Spaces {

    public static void main(String[] args) throws IOException {
        char ch;
        int spacesCounter = 0;
        int noSpacesCounter = 0;

        while ((ch = (char) System.in.read()) != '#') {
            while ((ch = (char) System.in.read()) == ' ') {
                spacesCounter++;
            }

            while ((ch = (char) System.in.read()) != ' ') {
                noSpacesCounter++;
            }
        }

        System.out.println("Spaces num: " + spacesCounter);
        System.out.println("No spaces num: " + noSpacesCounter);
    }
}
