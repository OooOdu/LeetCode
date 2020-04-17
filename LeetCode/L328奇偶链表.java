package LeetCode;

public class L328奇偶链表 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        // odd为奇数链 even为偶数链 head时奇数链的头节点 head的下一个节点时偶数链的头节点
        ListNode odd = head;
        ListNode cur = head.next;// 用于保存偶数链的头节点，便于最后的两个链表的连接
        ListNode even = cur;
        //如果偶数链或者奇数链上均没有下一个数字了
        while (odd.next != null && even.next != null) {
            //偶数链的下一个数字添加到奇数链上
            odd.next = even.next;
            //奇数链的前一个数字指向下一个奇数
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        //两个链表的连接
        odd.next = cur;
        return head;
    }
}
