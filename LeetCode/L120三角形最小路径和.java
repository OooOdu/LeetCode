package LeetCode;

import java.util.List;

public class L120三角形最小路径和 {
    public int minimumTotal(List<List<Integer>> triangle) {
        //临界值判断
        if (triangle.isEmpty())
            return 0;
        int n = triangle.size();
        //建一个二维数组dp，长宽比原来都+1
        int dp[][] = new int[n + 1][n + 1];
        //将dp中所有元素赋值为最大值，如果题目求路径和最大，则设置成最小值
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        //dp的初始条件
        dp[1][1] = triangle.get(0).get(0);
        //dp的条件dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i-1).get(j-1)
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j < triangle.get(i + 1).size(); j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i - 1).get(j - 1);
            }
        }
        //求出最小值
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.get(n).size(); i++) {
            min = min > triangle.get(n).get(i) ? min : triangle.get(n).get(i);
        }

        return min;

    }
}
