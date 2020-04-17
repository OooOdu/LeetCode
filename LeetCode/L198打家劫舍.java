package LeetCode;

public class L198打家劫舍 {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n + 1][2];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Integer.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = nums[i - 1] + dp[i - 1][0];
        }
        return dp[n][0] > dp[n][1] ? dp[n][0] : dp[n][1];
    }
}
