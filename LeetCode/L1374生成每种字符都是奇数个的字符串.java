package LeetCode;

public class L1374生成每种字符都是奇数个的字符串 {
    public String generateTheString(int n) {
        //如果n是奇数，则是n个b 是偶数就是一个a，n-1个b
        String res = "";
        if (n % 2 == 0) {
            res += "a";
            n--;
        }
        while (n-- > 0) {
            res += "b";
        }
        return res;
    }
}
