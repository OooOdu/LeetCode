package LeetCode;

import java.util.ArrayList;
import java.util.List;

class MovingAverage {
    double sum = 0;
    List<Integer> list;
    int maxSize;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        maxSize = size;
        list = new ArrayList<Integer>();
    }
    
    public double next(int val) {
        if(list.size()==maxSize) {
        	list.remove(0);
        	list.add(val);
        	for (Integer integer : list) {
				sum+=integer;
			}
        	return sum/maxSize;
        }
        else {
        	list.add(val);
        	for (Integer integer : list) {
				sum+=integer;
			}
        	return sum/list.size();
        }
    }
}
public class L346数据流中的移动平均值 {

}
