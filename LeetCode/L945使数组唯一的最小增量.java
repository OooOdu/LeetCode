package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L945使数组唯一的最小增量 {
    public int minIncrementForUnique(int[] A) {
        /*
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i : A) {
        //1. 如果set中不包含i，就加入到set中
            if (!set.contains(i)) {
                set.add(i);
            } else {
            //2. 如果set中包含i，则i++直到set能添加i
                while (set.contains(i)) {
                    i++;
                    count++;
                }
                set.add(i);
            }
        }
        return count;
         */

        //1.排序
        Arrays.sort(A);
        int count = 0;
        //2.如果后一个数小于等于前一个数，则后一个数增加为前一个数+1，增加量就是增加后的A[i+1]减去增加前的A[i+1]
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] <= A[i]) {
                count += A[i] - A[i + 1] + 1;
                A[i + 1] = A[i] + 1;
            }
        }
        return count;
    }
}
