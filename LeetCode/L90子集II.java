package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L90子集II {
    private void dfs(List<List<Integer>> result, List<Integer> cur, int[] nums, int pos, boolean visited[]) {
        if (pos == nums.length) {
            result.add(new ArrayList<>(cur));
            return;
        }
        if (pos == 0 || nums[pos] != nums[pos - 1] || visited[pos - 1]) {
            cur.add(nums[pos]);
            visited[pos] = true;
            dfs(result, cur, nums, pos + 1, visited);
            visited[pos] = false;
            cur.remove(cur.size() - 1);
        }
        dfs(result, cur, nums, pos + 1, visited);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(nums);
        boolean visited[] = new boolean[nums.length];
        dfs(result, cur, nums, 0, visited);
        return result;
    }
}
