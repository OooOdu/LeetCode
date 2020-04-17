package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L47全排列II {
    private void dfs(List<List<Integer>> result, List<Integer> cur, int[] nums, int pos, boolean visited[]) {
        if (pos == nums.length) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i] && (i == 0 || nums[i] != nums[i - 1] || visited[i - 1])) {
                cur.add(nums[i]);
                visited[i] = true;
                dfs(result, cur, nums, pos + 1, visited);
                visited[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean visited[] = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        dfs(result, cur, nums, 0, visited);
        return result;
    }
}
