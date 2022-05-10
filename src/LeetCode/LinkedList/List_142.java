package LeetCode.LinkedList;

public class List_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
            if (fast == low) {
                ListNode cur = head;
                while (cur != low) {
                    cur = cur.next;
                    low = low.next;
                }
                return low;
            }
            
        }
        return null;
    }
}
