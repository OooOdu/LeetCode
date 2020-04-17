package LeetCode;

public class L53最大子序和 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        //dp表示第几个数字之前最大的子序和
        int dp[] = new int[n + 1];
        dp[0] = 0;
        //i在nums数组中应该-1，第一个数字是nums[0]
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i - 1];
        }
        int maxSum = dp[1];
        for (int i = 2; i <= n; i++) {
            maxSum = maxSum > dp[i] ? maxSum : dp[i];
        }
        return maxSum;

    }
}
