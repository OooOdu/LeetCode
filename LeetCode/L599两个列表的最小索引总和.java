package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinyi
 * @date 2020/2/25 - 16:57
 **/
public class L599两个列表的最小索引总和 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int cur = i + j;
                    if (cur < index) {
                        res.clear();
                        index = cur;
                        res.add(list1[i]);
                    } else if (cur == index) {
                        res.add(list1[i]);
                    }
                }
            }
        }
        String ans[] = new String[res.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.get(i);
        }
        return ans;

        //2.哈希表做法
        //Map<String, Integer> map = new HashMap();
        //for(int i = 0; i < list1.length; i++) {
        //    map.put(list1[i], i);
        //}
        //
        //List<String> res = new ArrayList();
        //int min = Integer.MAX_VALUE;
        //for(int i = 0; i < list2.length; i++) {
        //    if (map.containsKey(list2[i])) {
        //        int j = map.get(list2[i]);
        //        if (i + j < min) {
        //            res.clear();
        //            res.add(list2[i]);
        //            min = i + j;
        //        } else if (i + j == min) {
        //            res.add(list2[i]);
        //        }
        //    }
        //}
        //
        //return res.toArray(new String[res.size()]);
    }
}
