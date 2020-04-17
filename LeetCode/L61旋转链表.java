package LeetCode;

/**
 * @author jinyi
 * @date 2020/2/21 - 21:06
 **/
public class L61旋转链表 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode rotateRight(ListNode head, int k) {
        //测试样例[1,2,3,4,5] k = 2;
        if (head == null || head.next == null || k == 0) return head;
        ListNode cur = head;
        int length = 1;
        //走出while循环后cur的位置在队尾5
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }
        k = length - k % length;
        if (k == length) return head;
        //首尾相连 5指向1，形成循环列表
        cur.next = head;
        //走完for循环后 cur的位置在3
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }
        //3的下一位4是队首
        ListNode res = cur.next;
        //将3的next指向null，表示断开循环链表；
        cur.next = null;
        return res;
    }
}
