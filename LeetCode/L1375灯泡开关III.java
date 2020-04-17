package LeetCode;

public class L1375灯泡开关III {
    public int numTimesAllBlue(int[] light) {
        //1.记录light数组的最大值max和返回值sum
        int max = light[0];
        int sum = 0;
        //2.遍历数组求最大值
        for (int i = 0; i < light.length; i++) {
            max = max > light[i] ? max : light[i + 1];
            //3.当最大值和下标数（时刻数）+1相等时，就是灯全亮的时候
            if (i + 1 == max) {
                sum++;
            }
        }
        return sum;
    }
    /*
                [2 , 1 , 3 , 5 , 4]
        时刻数：   0   1   2   3   4
        最大值：   2   2   3   5   4
        匹配数：   0   1   2   2   3
     */
}
