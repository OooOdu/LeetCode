package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L752打开转盘锁 {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<String>();
        Set<String> deadSet = new HashSet<String>();
        Set<String> set = new HashSet<String>();
        for (String string : deadends) {
            deadSet.add(string);
        }
        if (deadSet.contains(target) || deadSet.contains("0000"))
            return -1;
        queue.offer("0000");
        set.add("0000");
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                String vertex = queue.poll();
                if (vertex.equals(target))
                    return step;
                for (int i = 0; i < 4; i++) {
                    for (int j = -1; j <= 1; j += 2) {
                        int c = (vertex.charAt(i) - '0' + j + 10) % 10;
                        String cur = vertex.substring(0, i) + String.valueOf(c) + vertex.substring(i + 1);
                        if (!deadSet.contains(cur) && !set.contains(cur)) {
                            queue.offer(cur);
                            set.add(cur);
                        }
                    }
                }
            }
            step++;
        }
        return -1;

    }
}
