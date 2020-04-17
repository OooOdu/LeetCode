package LeetCode;
class MyCircularQueue {
    private int a[];//定义一个数组
    private int head ;//定义头指针
    private int tail ;//定义尾指针


    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        //初始化
        a = new int[k+1];
        head = 0;
        tail = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	//添加元素总是和尾指针有关，每次添加一个新元素，队尾向后移动一位，插入的值为value，a[tail]=value;
        if(isFull()) return false;
        a[tail] = value;
        tail = (tail+1) % a.length;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
    	//删除元素总是和头指针有关，每次删除一个新元素，队头向后移动一位
        if(isEmpty()) return false;
        head = (head+1)%a.length;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) return -1;
        return a[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) return - 1;
        //队尾指针指在数组最后一个元素的后一位
        //如果队尾为0，则最后一个元素是数组的最后一个元素，否则就是a[tail-1]个元素
        return tail==0 ? a[a.length-1] : a[tail-1];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == tail;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (tail+1) % a.length == head;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
public class L622设计循环队列 {

}
