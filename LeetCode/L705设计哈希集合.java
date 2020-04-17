package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinyi
 * @date 2020/2/22 - 19:29
 **/
public class L705设计哈希集合 {
    class MyHashSet {
        List<Integer> res;

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            res = new ArrayList<>();
        }

        public void add(int key) {
            if (contains(key)) return;
            res.add(key);
        }

        public void remove(int key) {
            if (!contains(key) || res.isEmpty()) return;
            for (int i = res.size() - 1; i >= 0; i--) {
                if (res.get(i) == key) {
                    res.remove(i);
                }
            }

        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            if (res.isEmpty()) return true;
            for (Integer re : res) {
                if (re == key) {
                    return false;
                }
            }
            return true;
        }
    }
}
