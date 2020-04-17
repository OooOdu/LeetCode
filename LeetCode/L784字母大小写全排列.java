package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L784字母大小写全排列 {
    List<String> res = new ArrayList<String>();

    private void dfs(int pos, char c[]) {
        if (pos == c.length) {
            res.add(new String(c));
            return;
        }
        char ch = c[pos];
        dfs(pos + 1, c);
        if (ch >= 'A') {
            ch ^= 32;
            c[pos] = ch;
            dfs(pos + 1, c);
        }

    }

    public List<String> letterCasePermutation(String S) {
        char c[] = S.toCharArray();
        dfs(0, c);
        return res;
    }
}
