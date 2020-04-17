package LeetCode;

import java.util.*;

/**
 * @author jinyi
 * @date 2020/2/27 - 20:27
 **/
public class L347前K个高频元素 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> cur = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            cur.add(Arrays.asList(e.getKey(), e.getValue()));
        }
        cur.sort((a, b) -> b.get(1) - a.get(1));
        for (int i = 0; i < k; i++) {
            res.add(cur.get(i).get(0));
        }
        return res;
    }
}
