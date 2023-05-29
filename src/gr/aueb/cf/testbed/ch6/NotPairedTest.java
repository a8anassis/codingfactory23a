package gr.aueb.cf.testbed.ch6;

public class NotPairedTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 7, 7, 8, 8, 3, 9};
        int result = findSingleElement(arr);
        System.out.println(result);
    }

    public static int findSingleElement(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
