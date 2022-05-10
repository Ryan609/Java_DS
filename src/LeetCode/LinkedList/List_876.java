package LeetCode.LinkedList;

public class List_876 {
    //中间值法
    // public ListNode middleNode(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode prev = head;
    //     int count = 0;
    //     while (prev != null) {
    //         prev = prev.next;
    //         count++;
    //     }

    //     ListNode cur = head;
    //     for (int i = 0; i < count/2; i++) {
    //         cur = cur.next;
    //     }
    //     return cur;
    // }  

    //快慢指针
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode low = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }

}
