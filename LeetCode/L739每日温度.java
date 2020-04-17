package LeetCode;

public class L739每日温度 {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (T[j] > T[i]) {
                    result[i] = j - i;
                    break;
                } else {
                    result[i] = 0;
                }
            }
        }
        return result;

    }
}
