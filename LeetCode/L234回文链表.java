package LeetCode;

import java.util.ArrayList;
import java.util.List;

import LeetCode.L141环形链表.ListNode;

public class L234回文链表 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> ans = new ArrayList<Integer>();
        //    if(head==null) return true;
        //    if(head!=null && head.next!=null) return true;
        ListNode cur = head;
        while (cur != null) {
            ans.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < ans.size(); i++) {
            if (!ans.get(i).equals(ans.get(ans.size() - i - 1)))
                return false;
        }
        return true;

    }
}
