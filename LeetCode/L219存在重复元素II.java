package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jinyi
 * @date 2020/2/25 - 17:17
 **/
public class L219存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n-k ; i++) {
            for (int j = i+1 ; j <k ; k++){
                if(nums[i] == nums[i+j]){
                    return true;
                }
            }
    }
        return false;
    }
}
