package LeetCode;

import java.util.Arrays;
import java.util.List;

public class L119杨辉三角II {
    public List<Integer> getRow(int rowIndex) {
        Integer dp[] = new Integer[rowIndex + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i < dp.length; i++) {
            for (int j = i - 1; j < dp.length; j++) {
                dp[j] += dp[i - 1];
            }
        }
        List<Integer> list = Arrays.asList(dp);
        return list;

    }
}
