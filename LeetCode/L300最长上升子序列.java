package LeetCode;

import java.util.Arrays;

public class L300最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null)
            return 0;
        if (nums.length <= 1) return nums.length;
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int max = dp[0];
        //遍历数组两便 如果找到一个数字之前的数字比他小 ，则dp[j]加1 如果dp[j]大于dp[i]，则dp[i]更新
        //这里注意dp[i] 和dp[j] dp[j]的更新同时更新dp[i]的数值
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = max > dp[i] ? max : dp[i];
        }
        return max;

    }
}
