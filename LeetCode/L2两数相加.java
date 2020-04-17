package LeetCode;

import java.sql.SQLOutput;

/**
 * @author jinyi
 * @date 2020/2/20 - 22:24
 **/
public class L2两数相加 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int add = 0;
        //while中止条件 两条链表同时指向null 并且向前进位不等于0（例如5+5，要继续下去把这个1加完才结束）
        while (l1 != null || l2 != null || add != 0) {
            int l1Val = l1 == null ? l1.val : 0;
            int l2Val = l2 == null ? l2.val : 0;
            int sumVal = l1Val + l2Val + add;
            add = sumVal / 10;
            //结果就是为10的余数
            ListNode temp = new ListNode(sumVal % 10);
            cur.next = temp;
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return res.next;
    }
}
