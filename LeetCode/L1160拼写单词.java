package LeetCode;

import java.util.Arrays;

public class L1160拼写单词 {
    public int countCharacters(String[] words, String chars) {
        //1.ch数组用来存放chars中每个字符出现的次数
        int ch[] = new int[26];
        //2.count数组用来存放words数组中每一个字符串中的数组出现的次数
        int count[] = new int[26];
        //3.返回值sum是答案
        int sum = 0;
        //4.获取chars中每个字符出现的次数
        for (char c : chars.toCharArray()) {
            ch[c - 'a']++;
        }
        //5.遍历words数组
        for (String s : words) {
            //6.很关键，每个words数组中的s字符串记过处理后，清空count数组，重置为0
            Arrays.fill(count, 0);
            //7.设立flag来进行判断
            boolean flag = true;
            //8.遍历s字符串的每个字符
            for (char c : s.toCharArray()) {
                int cur = c - 'a';
                //9.如果在ch数组中的字符出现的次数小于count数组次数，或者ch没出现s中的字符，则直接退出循环，并将flag制成false
                if (ch[cur] < ++count[cur]) {
                    flag = false;
                    break;
                }
            }
            //10.如果flag是true，表示复合所有要求，则在sum中加入字符串s的长度，反之，则加入0
            sum += flag ? s.length() : 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c - 96);
    }
}
