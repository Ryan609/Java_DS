package LeetCode.LinkedList;

public class List_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null||head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null) {
            if(prev.val == cur.val) {
                cur = cur.next;
            } else {
                prev.next = cur;
                prev = prev.next;
                cur = cur.next;
            }
        }
        prev.next = cur;
        return head;
    }
}