package LeetCode;

public class L365水壶问题 {
    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }


    /**
     * x = 3  y = 5  z = 4
     * 1.在容量为5的瓶子中倒满水
     * 2.倒入容量为3的瓶子中，此时5中瓶子的水是2L
     * 3.将3中的水清空
     * 4,将5中的2L水倒入3中
     * 5.倒满5中的水，此时3中水的容量是2L
     * 6.5向3倒水，倒1L后3中水满，5中剩余4L
     */


    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        } else if (x == z || y == z || x + y == z) {
            return true;
        } else {
            return z % gcd(x, y) == 0;
        }

    }
}
