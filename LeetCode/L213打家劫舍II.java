package LeetCode;

public class L213打家劫舍II {
	public int rob(int[] nums) {
		int n = nums.length;
		if(n<=0) return 0;
		if(n==1) return nums[0];
		int dp1[] = new int[n];
		int dp2[] = new int[n];
		dp1[1] = nums[0];
		for (int i = 2; i < n; i++) {
			dp1[i] = Integer.max(dp1[i - 1], dp1[i - 2] + nums[i - 1]);
		}
		dp2[1] = nums[1];
		for (int i = 2; i < n; i++) {
			dp2[i] = Integer.max(dp2[i - 1], dp2[i - 2] + nums[i]);
		}
		return dp1[n-1] > dp2[n-1] ? dp1[n-1] : dp2[n-1];
	}
}
