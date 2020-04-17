package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jinyi
 * @date 2020/2/24 - 17:29
 **/
public class L349两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        if (nums1.length == 0 && nums2.length == 0) return nums1;
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums1) {
            set.add(i);
        }
        for (Integer i : nums2) {
            if (set.contains(i)) {
                res.add(i);
            }
        }
        int ans[] = new int[res.size()];
        int k = 0;
        for (Integer i : res) {
            ans[k] = i;
            k++;
        }
        return ans;
    }
}
