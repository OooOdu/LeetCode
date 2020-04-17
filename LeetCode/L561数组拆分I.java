package LeetCode;

import java.util.Arrays;

public class L561数组拆分I {
    public int arrayPairSum(int[] nums) {
        //先将数组从小到大排序，以两个为一组取第一个数字，也就是取数组中所有奇数和
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
