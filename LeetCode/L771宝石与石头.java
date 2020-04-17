package LeetCode;

import java.util.HashMap;

/**
 * @author jinyi
 * @date 2020/2/27 - 19:31
 **/
public class L771宝石与石头 {
    public static int numJewelsInStones(String J, String S) {
        if (S.length() == 0 || J.length() == 0) return 0;
        HashMap<Character, Integer> res = new HashMap<>();
        for (char c : J.toCharArray()) {
            res.put(c, 0);
        }
        for (char c : S.toCharArray()) {
            if (res.containsKey(c)) {
                res.put(c, res.get(c) + 1);
            }
        }
        int sum = 0;
        for (Character character : res.keySet()) {
            sum += res.get(character);
        }
        return sum;
    }

}
