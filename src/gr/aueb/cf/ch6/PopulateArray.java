package gr.aueb.cf.ch6;

/**
 * Δήλωση, αρχικοποίηση πίνακα και
 * Populate (εισαγωγή στοιχείων)
 */
public class PopulateArray {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση πίνακα με length
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for
        for (int item : arr) {
            System.out.print(item + " ");
        }



        // Unsized Initialization
        int[] arr2 = {1, 5, 8, 9, 12};

        // Array Initializer
        int[] arr3;
        arr3 = new int[] {4, 6, 9, 10};

    }
}
