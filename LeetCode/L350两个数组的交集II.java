package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L350两个数组的交集II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        //1.建立一个字典，用来存放数组中出现的数字和出现的次数
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //2.建立一个arraylist，用来存放结果
        List<Integer> list = new ArrayList<Integer>();
        //3.遍历nums1数组，存放数字，如果存在，则value加一，如果不存在，则设置为0+1；
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        //4.遍历nums2数组，如果map中已出现数字，且值大于1，自减一，并添加到list数组
        //这样可以避免判断nums1和nums2中相同数字的多少
        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                if (map.get(nums2[j]) >= 1) {
                    map.put(nums2[j], map.get(nums2[j]) - 1);
                    list.add(nums2[j]);
                }
            }
        }
        //5.因为返回值是int数组，所以将list中的结果存入到a中
        int a[] = new int[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        System.out.println(intersect(nums1, nums2)[0]);

    }

}
