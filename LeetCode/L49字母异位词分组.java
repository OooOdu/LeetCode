package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author jinyi
 * @date 2020/2/26 - 19:36
 **/
public class L49字母异位词分组 {
    private static String sortStr(String s) {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> res = new HashMap<>();
        for (String cur : strs) {
            String cursor = sortStr(cur);
            if (!res.containsKey(cursor)) {
                res.put(cursor, new ArrayList<>());
            }
            res.get(cursor).add(cur);
        }
        return new ArrayList<>(res.values());
    }
}
