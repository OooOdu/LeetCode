package LeetCode;

public class L64最小路径和 {
    public int minPathSum(int[][] grid) {
        if (grid == null) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        //初始化数组
        dp[0][0] = grid[0][0];
        //dp数组记录的是走到第i，j时的距离
        //数组每一行第一个数字均是dp上一行第一个数字加上grid数组当前的长度；
        //用途是初始化第一行和第一列的dp数组；
        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] += grid[0][j] + dp[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
