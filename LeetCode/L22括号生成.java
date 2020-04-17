package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L22括号生成 {
    List<String> res = new ArrayList<String>();

    private void dfs(int left, int right, String cur) {
        if (left == 0 && right == 0) {
            res.add(new String(cur));
            return;
        }
        //如果左括号的个数大于零，表示左括号可以添加
        if (left > 0) {
            dfs(left - 1, right, cur + "(");
        }
        //如果右括号的个数大于左括号的个数，则右括号可以添加
        if (right > left) {
            dfs(left, right - 1, cur + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        //第一个n代表的是左括号剩余的个数，第二个n是代表右括号的剩余的个数
        dfs(n, n, "");
        return res;
    }
}
