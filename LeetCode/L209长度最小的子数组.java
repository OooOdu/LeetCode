package LeetCode;

public class L209长度最小的子数组 {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int result = n + 1;
        //二重循环遍历
        for (int i = 0; i < n - 1; i++) {
            sum = nums[i];
            if (sum >= s) {
                result = 1;
                break;
            }
            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    result = result < j - i + 1 ? result : j - i + 1;
                    break;
                }
            }
        }
        if (result != n + 1 )
            return result;
        return 0;
    }
}
