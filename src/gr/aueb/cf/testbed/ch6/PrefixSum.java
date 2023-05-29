package gr.aueb.cf.testbed.ch6;

import java.util.Arrays;

/**
 * Άθροισμα όλων των sub-arrays
 */
public class PrefixSum {

    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int subarraySum(int[] prefix, int i, int j) {
        if (i == 0) {
            return prefix[j];
        }
        return prefix[j] - prefix[i - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = prefixSum(arr);
        System.out.println(Arrays.toString(prefix)); // [1, 3, 6, 10, 15]
        System.out.println(subarraySum(prefix, 1, 3)); // 9
        System.out.println(subarraySum(prefix, 0, 4)); // 15
    }
}

