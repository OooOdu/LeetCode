package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinyi
 * @date 2020/2/27 - 19:47
 **/
public class L170两数之和III数据结构设计 {
    class TwoSum {
        public List list;

        /**
         * Initialize your data structure here.
         */
        public TwoSum() {
            list = new ArrayList();
        }

        /**
         * Add the number to an internal data structure..
         */
        public void add(int number) {
            list.add(number);
        }

        /**
         * Find if there exists any pair of numbers which sum is equal to the value.
         */
        public boolean find(int value) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                int complement = value - (int) list.get(i);
                if (map.containsKey(complement)) {
                    return true;
                }
                map.put((int) list.get(i), i);
            }
            return false;
        }
    }
}
