package DS.zuoClass.LinkedList;

/**
 * @author: xinyan
 * @data: 2022/09/02/09:36
 **/

public class 单链表反转 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
