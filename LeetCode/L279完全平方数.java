package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L279完全平方数 {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        queue.offer(n);
        set.add(n);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int vertex = queue.poll();
                if (vertex == 0)
                    return depth;
                for (int i = 1; i * i <= vertex; i++) {
                    int cur = vertex - i * i;
                    if (set.add(cur)) {
                        queue.offer(cur);
                        set.add(cur);
                    }
                }
            }
            depth++;
        }
        return -1;
    }
}
