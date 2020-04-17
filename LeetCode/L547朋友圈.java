package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinyi
 * @date 2020/2/23 - 19:19
 **/
public class L547朋友圈 {
    List<Integer> fathers = new ArrayList<>();

    private int find(int i) {
        while (fathers.get(i) != i) {
            i = fathers.get(i);
        }
        return i;
    }

    public void union(int i, int j) {
        int f1 = find(i);
        int f2 = find(j);
        fathers.set(f2, f1);
    }

    public int findCircleNum(int[][] M) {
        int count = 0;
        if (M == null || M.length == 0) return 0;
        int m = M.length;
        for (int i = 0; i < m; i++) {
            fathers.add(i);
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (fathers.get(i) == i) {
                count++;
            }
        }
        return count;
    }
}
