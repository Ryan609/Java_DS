package LeetCode.LinkedList;



public class List_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode cur = prev.next;

        while(cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                break;
            } else {
                if (cur.val != next.val) {
                    prev = prev.next;
                    cur = cur.next;
                } else {
                    while(next != null && next.val == cur.val) {
                        next = next.next;
                    }
                    prev.next = next;
                    cur = next;
                }
            }
        }
        return dummyHead.next;
    }
}
