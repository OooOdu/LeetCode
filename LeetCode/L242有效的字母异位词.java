package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L242有效的字母异位词 {
    private static boolean isAnagram(String s, String t) {
        //1.建立一个哈希图，用来存放字符串中出现的字符以及出现的次数
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //2.如果字符串长度不一样，则直接返回fasle
        if (s.length() != t.length()) {
            return false;
        }
        //3.将字符串s中出现的字符添加到map中，如果map中不存在该数字，则默认值设为0，反之，则加1，很关键
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //4.遍历字符串t中的每一个字符
        for (char ch : t.toCharArray()) {
            //5.如果字符不存在于map中，则返回false
            if (map.get(ch) == null) {
                return false;
            }//6.如果字符存在，且大于1，则减一
            else if (map.get(ch) > 1) {
                map.put(ch, map.get(ch) - 1);
            } //7.如果为0，则删除该键
            else {
                map.remove(ch);
            }
        }
        //8.如果map为空，则为true，反之为fasle
        return map.isEmpty();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "ss";
        String t = "sa";
        boolean bo = isAnagram(s, t);
        System.out.println(bo);

    }

}
