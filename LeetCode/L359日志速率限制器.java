package LeetCode;

import java.util.HashMap;

/**
 * @author jinyi
 * @date 2020/2/26 - 19:03
 **/
public class L359日志速率限制器 {
    class Logger {
        HashMap<String, Integer> res;

        /**
         * Initialize your data structure here.
         */
        public Logger() {
            res = new HashMap<>();
        }

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {
                if(!res.containsKey(message)){
                    res.put(message,timestamp);
                    return true;
                }else{
                    if(timestamp>=res.get(message)+10){
                        res.put(message,timestamp);
                        return true;
                    }
                    return false;
                }
        }
    }
}
