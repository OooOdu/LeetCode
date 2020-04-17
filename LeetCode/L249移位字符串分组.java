package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author jinyi
 * @date 2020/2/26 - 20:26
 **/
public class L249移位字符串分组 {
    private static List<Integer> sortNums(String s) {
        List<Integer> ans = new ArrayList<>();
        //防止出现aa，bb和a的情况出现
        if (s.length() == 1) ans.add(100);
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            ans.add((c[i + 1] - c[i]) % 26);
        }
        return ans;
    }

    public List<List<String>> groupStrings(String[] strings) {
        HashMap<List<Integer>, List<String>> res = new HashMap<>();
        for (String s : strings) {
            List<Integer> cur = sortNums(s);
            if (!res.containsKey(cur)) {
                res.put(cur, new ArrayList<String>());
            }
            res.get(cur).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
