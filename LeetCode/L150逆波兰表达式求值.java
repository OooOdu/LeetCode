package LeetCode;

import java.util.Stack;

public class L150逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            //1.如果字符的长度为1位，则可能是运算符也可能是数字，所以进行判断
            String s = tokens[i];
            if (s.length() == 1) {
                char c = s.charAt(0);
                if (c >= '0' && c <= '9') {
                    stack.push(Integer.valueOf(s));
                } else {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    //将结果 push入栈，使得至少2个元素进行运算
                    if (s.equals("+")) {
                        stack.push(num2 + num1);
                    } else if (s.equals("-")) {
                        stack.push(num2 - num1);
                    } else if (s.equals("*")) {
                        stack.push(num2 * num1);
                    } else if (s.equals("/")) {
                        stack.push(num2 / num1);
                    }

                }
            } else {//如果字符大于1，则一定是数字，直接压入栈
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
