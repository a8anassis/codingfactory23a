package gr.aueb.cf.testbed.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:/tmp/intfile.txt"));
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
