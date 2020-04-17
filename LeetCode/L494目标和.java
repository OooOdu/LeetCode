package LeetCode;


public class L494目标和 {
    int count = 0;

    public void dfs(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S) {
                count++;
            }
        } else {
            dfs(nums, i + 1, sum - nums[i], S);
            dfs(nums, i + 1, sum + nums[i], S);
        }
    }

    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, 0, S);
        return count;
    }
}
