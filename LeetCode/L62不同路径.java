package LeetCode;

public class L62不同路径 {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        //如果二维数组为空数组 则为0
        if (m == 0 && n == 0)
            return 0;
        //如果是一维数组，则走法唯一
        if (m == 0 || n == 0)
            return 1;
        //初始化数组
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //终点是由它左边或者他上方的格子走一步到达
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}
