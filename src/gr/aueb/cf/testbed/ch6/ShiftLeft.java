package gr.aueb.cf.testbed.ch6;

public class ShiftLeft {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] arr2 = shiftLeft(arr, 4);
        for (int item : arr2) {
            System.out.print(item + " ");
        }
    }

    public static int[] shiftLeft(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset <= 0) return arr;

        int[] arrayToReturn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //arrayToReturn[(i - offset % arr.length + arr.length) % arr.length] = arr[i];
            arrayToReturn[i] = arr[(i + offset) % arr.length];
        }
        return arrayToReturn;
    }
}
