package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L78子集 {
    private void dfs(List<List<Integer>> result, List<Integer> cur, int[] nums, int pos) {
        if (pos == nums.length) {
            result.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[pos]);
        dfs(result, cur, nums, pos + 1);
        cur.remove(cur.size() - 1);
        dfs(result, cur, nums, pos + 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        dfs(result, cur, nums, 0);
        return result;
    }
}
