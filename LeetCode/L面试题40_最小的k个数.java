package LeetCode;

import java.util.Arrays;

public class L面试题40_最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int res[] = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res ;
    }
}
