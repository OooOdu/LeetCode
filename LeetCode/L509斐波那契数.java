package LeetCode;

public class L509斐波那契数 {
    public int fib(int N) {
        int dp[] = new int[30 + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }
}