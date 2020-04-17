package LeetCode;

import java.util.Stack;

public class L155最小栈 {
    class MinStack {
        Stack<Integer> stack;//记录最小值
        Stack<Integer> minStack;//记录数字的序列

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        public void push(int x) {
            minStack.push(x);
            if (stack.isEmpty() || x < stack.peek()) {//注意先判断栈是否为空
                stack.push(x);
            } else {
                stack.push(stack.peek());
            }
        }

        public void pop() {
            if (minStack.isEmpty()) return;
            minStack.pop();
            stack.pop();

        }

        public int top() {
            return minStack.peek();
        }

        public int getMin() {
            return stack.peek();
        }
    }
}
