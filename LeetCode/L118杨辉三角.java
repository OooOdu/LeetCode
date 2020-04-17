package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L118杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        //1.list存储结果并返回
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //2.如果输入0，表示0行，返回空的list
        if (numRows == 0)
            return list;
        //3.如果输入大于等于1行
        for (int i = 1; i <= numRows; i++) {
            //4.建立Integer数组存储，便于转化成list，不能用int数组
            Integer dp[] = new Integer[i];
            //5.将Integer数组中的数字全设置为1，进行dp的时候从第三项开始首尾的1均不改变
            Arrays.fill(dp, 1);
            //6.调用方法将Integer数组转化成list
            list.add(Arrays.asList(dp));
            //7.第1第2项不进行更改，因为首尾的1均不能更改，从第三项开始111，改变中间1的数值成1+1
            if (i >= 3) {
                //8.i-k是dp的次数。第三项需要进行1次dp，第四项需要进行2次dp
                for (int k = 3; k <= i; k++) {
                    //9.dp开始的位置是dp[k-2]，由第三项的位置是1推出，所以j=k-2，结束位置为dp[1]
                    //因为首尾的1均不能动，找的其实是行数和dp数组下标的关系
                    for (int j = k - 2; j > 0; j--) {
                        //比如第三项111 就是1 1+1 1，中间的1和首位的1相加
                        //第四项 1111 ，第一次dp j=1，1211 第二次dp j=2 1211->1231->1331
                        dp[j] += dp[j - 1];
                    }
                }
            }

        }
        return list;
    }
}
