package 剑指offer;

/**
 * @author: xinyan
 * @data: 2022/08/02/16:25
 **/
public class 反转链表 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode dh = new ListNode(-1);
        ListNode pre = null;
        dh.next = pre;

        while (head != null) {
            int val = head.val;
            head = head.next;
            ListNode node = new ListNode(val);
            node.next = dh.next;
            dh.next = node;
        }
        return dh.next;
    }
}
