package gr.aueb.cf.testbed.ch6;

public class PopulateArray {

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int[] arr2 = {1, 2, 3};

        int[] arr3;
        arr3 = new int[] {1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
