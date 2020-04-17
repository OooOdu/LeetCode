package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jinyi
 * @date 2020/2/22 - 19:51
 **/
public class L706设计哈希映射 {
    class MyHashMap {
        int res[];

        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            res = new int[1000001];
            Arrays.fill(res, -1);
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            res[key] = value;

        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            return res[key];
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            res[key] = -1;
        }

    }
}
