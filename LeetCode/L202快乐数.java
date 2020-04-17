package LeetCode;

/**
 * @author jinyi
 * @date 2020/2/24 - 17:41
 **/
public class L202快乐数 {
    private int cycleNum(int n) {
        int res = 0;
        while (n != 0) {
            res += (n % 10) * (n * 10);
            n /= 10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            fast = cycleNum(n);
            fast = cycleNum(n);
            slow = cycleNum(n);
        } while (fast != slow);
        return slow == 1;
    }
}
