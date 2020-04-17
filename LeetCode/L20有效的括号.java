package LeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class L20有效的括号 {
    public boolean isValid(String s) {
        // 1.如果字符串长度是0，则合法，如果为奇数，则一定不合法
        if (s.length() == 0)
            return true;
        if (s.length() == 1)
            return false;
        // 2.用set来存储左括号，空间复杂度为0(1)
        Set<Character> set = new HashSet<Character>();
        set.add('(');
        set.add('[');
        set.add('{');
        char c[] = s.toCharArray();
        int count = 0;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < c.length; i++) {
            if (set.contains(c[i])) {
                stack.push(c[i]);
            } else {
                if (stack.isEmpty())
                    return false;
                char vertex = stack.pop();
                if ((vertex + String.valueOf(c[i])).equals("()")
                        || (String.valueOf(vertex) + String.valueOf(c[i])).equals("[]")
                        || (String.valueOf(vertex) + String.valueOf(c[i])).equals("{}")) {
                    count++;
                }
            }
        }
        if (stack.isEmpty() && count == s.length() / 2)
            return true;
        return false;

    }
}
