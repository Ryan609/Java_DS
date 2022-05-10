package LeetCode.LinkedList;

public class List_offer_22 {
    //快慢指针
    // public ListNode getKthFromEnd(ListNode head, int k) {
    //     ListNode fast = head;
    //     ListNode low = head;

    //     for (int i = 0; i < k; i++) {
    //         fast = fast.next;
    //     }
    //     while (fast != null) {
    //         fast = fast.next;
    //         low = low.next;
    //     }
    //     return low;
    // }

    //遍历
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode prev = head;
        ListNode cur = head;
        while (prev != null) {
            prev = prev.next;
            count++;
        }

        if (k <= count) {
            for (int i = 0; i < count-k; i++) {
                cur = cur.next;
            }
        }
        return cur;
    }
}
