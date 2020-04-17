package LeetCode;

public class L557反转字符串中的单词III {

    public String reverseWords(String s) {
        //利用stringbulider的reverse方法反转字符串并进行字符串连接加快速度
        String string[] = s.split(" ");
        StringBuilder sBuilder = new StringBuilder("");
        for (String str : string) {
            sBuilder.append(new StringBuilder(str).reverse() + " ");
        }
        return sBuilder.toString().trim();
    }

}
