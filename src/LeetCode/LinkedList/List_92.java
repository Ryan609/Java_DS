package LeetCode.LinkedList;

public class List_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode cur = prev.next;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
            cur = cur.next;
        }
        ListNode next = cur.next;

        for (int i = 0; i < right - left; i++) {
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = cur.next;
        }
        return dummyHead.next;
    }
}
