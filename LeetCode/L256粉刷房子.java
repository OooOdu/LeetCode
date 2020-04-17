package LeetCode;

public class L256粉刷房子 {
    public int minCost(int[][] costs) {
        if (costs == null) return 0;
        int n = costs.length;
        int dp[][] = new int[n][3];
        //将dp的第0行赋值
        for (int i = 0; i < 3; i++) {
            dp[0][i] = costs[0][i];
        }
        //从第一层开始，每个位置等于价格加上上一行不同列的最小值；
        //如果数组中有一个数字给定了，则一定要去重点分析这个数字的含义
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][0];
        }
        return Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]);
    }
}
