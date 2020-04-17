package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L77z组合 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> cur = new ArrayList<Integer>();

    public List<List<Integer>> combine(int n, int k, int pos) {
        dfs(n, k, 1);
        return res;
    }

    private void dfs(int n, int k, int pos) {
        if (k == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = pos; i <= n; i++) {
            cur.add(i);
            dfs(n, k - 1, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
