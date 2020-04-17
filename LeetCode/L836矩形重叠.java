package LeetCode;

public class L836矩形重叠 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //如果rec1的最大横坐标比rec2的最小横坐标还要小或者rec1最大纵坐标小于rec2最小纵坐标，则他们不可能重叠
        return rec1[2]<=rec2[0]||rec1[2]>=rec2[0] || rec1[1]>=rec2[3]||rec1[3]<=rec2[1];
    }
}
