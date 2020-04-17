package LeetCode;

import java.util.Arrays;

public class L747至少是其他数字两倍的最大数 {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int max = Integer.MIN_VALUE;
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                result = i;
            }
        }
        Arrays.sort(nums);
        if (max >= nums[n - 2] * 2) {
            return result;
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
