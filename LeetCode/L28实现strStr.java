package LeetCode;

public class L28实现strStr {
    public static int strStr(String haystack, String needle) {
        //1.如果两个字符串均为空，则返回0；
        if (haystack == null && needle == null)
            return 0;
        //2.遍历长的字符串，索引值最大取到两个字符串相减的长度
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            //3.很关键，j 作为变量可以用于接下来的判断
            int j = 0;
            //4.遍历短的字符串
            for (j = 0; j < needle.length(); j++) {
                //5.如果不匹配，则推出该循环
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            //6.如果 j能走完循环，则返回 i值，i即为短字符串第一个出现的位置
            if (j == needle.length()) {
                return i;
            }

        }
        //7.如果走不通，就返回-1，表示长的字符串中不存在该短字符串
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));

    }

}
