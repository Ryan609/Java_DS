package LeetCode.LinkedList;

public class List_interview_02_04 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null ) {
            return head;
        }

        ListNode bigHead = new ListNode();
        ListNode smallHead = new ListNode();
        ListNode bigTail = bigHead;
        ListNode smallTail = smallHead;
        while (head != null) {
            if (head.val < x) {
                smallTail.next = head;
                smallTail = head;
                head = head.next;
            } else {
                bigTail.next = head;
                bigTail = head;
                head = head.next;
            }
        }
        bigTail.next = null;
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
