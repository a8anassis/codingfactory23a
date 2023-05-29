package gr.aueb.cf.testbed.ch6;

import java.util.Arrays;

public class ArrCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3;


        //System.arraycopy(arr, 0, arr2, 0, arr.length - 1);
        arr3 = Arrays.copyOfRange(arr, 1, arr.length + 1);

        for (int item : arr3) {
            System.out.print(item + " ");
        }


    }
}
